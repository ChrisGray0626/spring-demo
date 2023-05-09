package pers.chris.template.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.chris.template.common.base.BaseController;
import pers.chris.template.dao.DaoTemplate;
import pers.chris.template.pojo.entity.EntityTemplate;
import pers.chris.template.service.ServiceTemplate;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description Controller模板
 */

@Api(tags = "Template")
@RequestMapping("/template")
@RestController
public class ControllerTemplate extends BaseController<EntityTemplate, DaoTemplate, ServiceTemplate> {
}
