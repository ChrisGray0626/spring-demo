package pers.chris.template.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description VO模板
 */

@ApiModel("Template VO")
@Data
public class VOTemplate {

    @ApiModelProperty("姓名")
    private String name;
}
