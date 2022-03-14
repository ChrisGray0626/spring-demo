package pers.chris.springdemo.common.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @Author Chris
 * @Date 2022/3/10 11:53 AM
 * @Description 通用Service
 */
public abstract class BaseService<T extends BaseDO, Repo extends BaseRepo<T>> {


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
