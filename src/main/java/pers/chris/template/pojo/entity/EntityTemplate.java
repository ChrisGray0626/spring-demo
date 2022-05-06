package pers.chris.template.pojo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pers.chris.template.annotation.AnnotationTemplate;
import pers.chris.template.common.base.BaseDO;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description Entity 模板
 */

@Entity
@Table(name = "entity_table")
@Data
@EqualsAndHashCode(callSuper = true)
public class EntityTemplate extends BaseDO {

    @AnnotationTemplate
    private String name;
}
