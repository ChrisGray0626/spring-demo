package pers.chris.springdemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.chris.springdemo.common.base.BaseController;
import pers.chris.springdemo.dao.DemoRepo;
import pers.chris.springdemo.pojo.DemoDO;
import pers.chris.springdemo.service.DemoService;

@Api(tags = "Demo")
@RequestMapping("/demo")
@RestController
public class Controller extends BaseController<DemoDO, DemoRepo, DemoService> {
}
