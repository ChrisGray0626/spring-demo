package pers.chris.template.util.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pers.chris.template.pojo.DOTemplate;
import pers.chris.template.pojo.VOTemplate;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description MapStruct Mapper模板
 */

@Mapper
public interface MapperTemplate {

    MapperTemplate INSTANCE = Mappers.getMapper(MapperTemplate.class);

    VOTemplate DO2VO(DOTemplate demoDO);
}
