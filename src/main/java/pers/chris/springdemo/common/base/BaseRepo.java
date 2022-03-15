package pers.chris.springdemo.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import javax.transaction.Transactional;

/**
 * @Author Chris
 * @Date 2022/3/7 10:34 AM
 * @Description 通用Repository
 */
@NoRepositoryBean
public interface BaseRepo<T extends BaseDO> extends JpaRepository<T, String>, JpaSpecificationExecutor<T> {

    @Query("update #{#entityName} e set e.deleted = 1 where e.id = ?1")
    @Transactional
    @Modifying
    void deleteLogically(String id);

    @Transactional
    default void deleteLogically(T entity) {
        deleteLogically(entity.getId());
    }

    @Query("update #{#entityName} e set e.deleted = 1 ")
    @Transactional
    @Modifying
    void logicDeleteAll();
}
