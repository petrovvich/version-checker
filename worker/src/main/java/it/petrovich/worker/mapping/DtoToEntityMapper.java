package it.petrovich.worker.mapping;

import it.petrovich.worker.dto.MavenRepository;
import it.petrovich.worker.entity.Repository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

@Mapper(imports = {LocalDateTime.class})
public interface DtoToEntityMapper {

    DtoToEntityMapper INSTANCE = Mappers.getMapper(DtoToEntityMapper.class);

    @Mapping(target = "created", expression = "java(LocalDateTime.now())")
    @Mapping(target = "updated", expression = "java(LocalDateTime.now())")
    Repository map(MavenRepository source);
}
