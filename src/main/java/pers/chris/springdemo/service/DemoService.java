package pers.chris.springdemo.service;

import org.springframework.stereotype.Service;
import pers.chris.springdemo.common.base.BaseService;
import pers.chris.springdemo.dao.DemoRepo;
import pers.chris.springdemo.pojo.DemoDO;

@Service
public class DemoService extends BaseService<DemoDO, DemoRepo> {
}
