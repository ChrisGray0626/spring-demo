package pers.chris.springdemo.mapper;


import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public class Mapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

}
