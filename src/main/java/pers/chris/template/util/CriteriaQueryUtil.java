package pers.chris.template.util;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import pers.chris.template.common.base.BaseEntity;
import pers.chris.template.common.wrapper.CriteriaQueryWrapper;

/**
 * @Author Chris
 * @Date 2022/3/16 5:27 PM
 * @Description 条件查询工具
 */
public class CriteriaQueryUtil {

    private CriteriaQueryUtil() {};

    public static Specification<? extends BaseEntity> build(List<CriteriaQueryWrapper> queryWrappers) {

        return (root, query, builder) -> {
            List<Predicate> predicates = build(queryWrappers, root, builder);
            return query.where(predicates.toArray(new Predicate[0])).getRestriction();
        };
    }

    public static List<Predicate> build(List<CriteriaQueryWrapper> queryWrappers,
                                        Root<? extends BaseEntity> root, CriteriaBuilder builder) {
        List<Predicate> predicates = new LinkedList<>();
        for (CriteriaQueryWrapper wrapper: queryWrappers) {
            String fieldName = wrapper.getFieldName();
            Object fieldValue = wrapper.getFieldValue();
            // 过滤空值
            if (fieldValue instanceof String) {
                if (((String) fieldValue).isEmpty()) {
                    continue;
                }
            }
            else {
                if (fieldValue == null) {
                    continue;
                }
            }

            switch (wrapper.getQueryOperationType()) {
                case EQUAL:
                    predicates.add(builder.equal(root.get(fieldName), fieldValue));
                    break;
                case LIKE:
                    predicates.add(builder.like(root.get(fieldName), (String) fieldValue));
                    break;
                default:
            }
        }
        return predicates;
    }
}
