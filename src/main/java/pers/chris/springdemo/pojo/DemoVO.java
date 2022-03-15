package pers.chris.springdemo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class DemoVO {

    @ApiModelProperty("姓名")
    private String name;
}
