package pers.chris.template.util.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pers.chris.template.pojo.DTOTemplate;
import pers.chris.template.pojo.VOTemplate;
import pers.chris.template.pojo.entity.EntityTemplate;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description MapStruct Mapper模板
 */

@Mapper
public interface MapperTemplate {

    MapperTemplate INSTANCE = Mappers.getMapper(MapperTemplate.class);

    VOTemplate Entity2VO(EntityTemplate entity);
    EntityTemplate DTO2Entity(DTOTemplate dto);
}
