package pers.chris.template.common.base;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @Author Chris
 * @Date 2022/3/10 11:53 AM
 * @Description 通用Service
 */
public abstract class BaseService<T extends BaseEntity, Repo extends BaseDao<T>> {

    // TODO @Resource to @Autowired
    @Autowired
    protected Repo repo;

    public T add(T t) {
        return repo.save(t);
    }

    public List<T> findAll() {
        return repo.findAll();
    }

    public Page<T> findAll(BaseQuery query) {
        PageRequest pageRequest = PageRequest.of(query.getPage(), query.getSize());
        return repo.findAll(pageRequest);
    }

    public T findOne(String id) {
        return repo.findById(id).orElse(null);
    }

    public void update(T t) {
        repo.save(t);
    }

    public void delete(String id) {
        repo.deleteLogically(id);
    }
}
