package pers.chris.template.common.base;

import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pers.chris.template.common.response.Response;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 通用Controller
 */
public abstract class BaseController<T extends BaseDO, Repo extends BaseRepo<T>, Service extends BaseService<T, Repo>> {

    @Resource
    protected Service service;

    @ApiOperation("新增")
    @PostMapping("")
    public T add(@RequestBody T t) {
        return service.add(t);
    }

    @ApiOperation("查询")
    @GetMapping("/{id}")
    public T findOne(@PathVariable("id") String id) {
        return service.findOne(id);
    }

    @ApiOperation("更新")
    @PutMapping("")
    public Response update(@RequestBody T t) {
        service.update(t);
        return Response.success();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    public Response delete(@PathVariable("id") String id) {
        service.delete(id);
        return Response.success();
    }
}
