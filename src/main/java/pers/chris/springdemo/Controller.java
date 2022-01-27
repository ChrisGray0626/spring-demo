package pers.chris.springdemo;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pers.chris.springdemo.service.DemoService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @Autowired
    private DemoService demoService;

    @ApiOperation(value = "", tags = {""})
    @GetMapping("/demo/{id}")
    public String get(@PathVariable("id") String id,
                      @RequestParam("name") String name,
                      @RequestPart("file") MultipartFile file, HttpServletRequest request) {
        return null;
    }

}
