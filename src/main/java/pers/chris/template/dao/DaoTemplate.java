package pers.chris.template.dao;

import org.springframework.stereotype.Repository;
import pers.chris.template.common.base.BaseDao;
import pers.chris.template.pojo.entity.EntityTemplate;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description Repository模板
 */

@Repository
public interface DaoTemplate extends BaseDao<EntityTemplate> {

    EntityTemplate findByName(String name);
}
