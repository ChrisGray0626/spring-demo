package pers.chris.template.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Author Chris
 * @Date 2022/3/7 10:34 AM
 * @Description 通用Repository
 */
@NoRepositoryBean
public interface BaseDao<T extends BaseEntity> extends JpaRepository<T, String>, JpaSpecificationExecutor<T> {

    @Query("update #{#entityName} e set e.deleted = 1 where e.id = ?1")
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    void deleteLogically(String id);

    @Transactional(rollbackFor = Exception.class)
    default void deleteLogically(T entity) {
        deleteLogically(entity.getId());
    }

    @Query("update #{#entityName} e set e.deleted = 1 ")
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    void logicDeleteAll();
}
