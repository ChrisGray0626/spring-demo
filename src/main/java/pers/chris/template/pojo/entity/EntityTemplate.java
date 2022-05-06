package pers.chris.template.pojo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import pers.chris.template.annotation.AnnotationTemplate;
import pers.chris.template.common.base.BaseEntity;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description Entity 模板
 */

@Entity
@Table(name = "entity_table")
@Data
@EqualsAndHashCode(callSuper = true)
public class EntityTemplate extends BaseEntity {

    @AnnotationTemplate
    private String name;
}
