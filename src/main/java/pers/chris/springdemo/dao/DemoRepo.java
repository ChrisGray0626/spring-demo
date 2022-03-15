package pers.chris.springdemo.dao;

import org.springframework.stereotype.Repository;
import pers.chris.springdemo.common.base.BaseRepo;
import pers.chris.springdemo.pojo.DemoDO;

@Repository
public interface DemoRepo extends BaseRepo<DemoDO> {
}
