package pers.chris.template.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Chris
 * @Date 2022/3/17 10:21 AM
 * @Description DTO模板
 */

@ApiModel("Template DTO")
@Data
public class DTOTemplate {

    @ApiModelProperty("姓名")
    private String name;
}
