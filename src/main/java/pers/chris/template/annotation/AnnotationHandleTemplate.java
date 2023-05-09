package pers.chris.template.annotation;

import java.lang.reflect.Field;
import pers.chris.template.annotation.AnnotationTemplate;
import pers.chris.template.pojo.entity.EntityTemplate;

/**
 * @Author Chris
 * @Date 2022/5/6
 * @Description Annotation 处理模板
 */
public class AnnotationHandleTemplate {

    private AnnotationHandleTemplate() {}

    public static void handle(EntityTemplate entity) throws IllegalAccessException {
        for (Field field: EntityTemplate.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(AnnotationTemplate.class)) {
                AnnotationTemplate annotation = field.getAnnotation(AnnotationTemplate.class);
                // 允许访问私有属性
                field.setAccessible(true);
                field.set(entity, annotation.name());
            }
        }
    }
}
