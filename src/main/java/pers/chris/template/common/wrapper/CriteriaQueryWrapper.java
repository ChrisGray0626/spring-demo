package pers.chris.template.common.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import pers.chris.template.common.type.QueryOperationTypeEnum;

/**
 * @Author Chris
 * @Date 2022/3/16 5:24 PM
 * @Description 条件查询包装类
 */

@Data
@AllArgsConstructor
public class CriteriaQueryWrapper {

    private String fieldName;
    private Object fieldValue;
    private QueryOperationTypeEnum queryOperationType;
}
