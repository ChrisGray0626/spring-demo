package pers.chris.template.pojo;

import lombok.Data;
import pers.chris.template.common.base.BaseDO;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description DO模板
 */

@Entity
@Table(name = "templateDO")
@Data
public class DOTemplate extends BaseDO {

    private String name;
}
