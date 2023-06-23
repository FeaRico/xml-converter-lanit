package ru.makhach.xmlconverter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.makhach.xmlconverter.model.entity.AuthorEntity;
import ru.makhach.xmlconverter.model.xml.response.attribute.Employee;

/**
 * Маппер {@link AuthorEntity Авторов} из JPA-сущности в XML-сущность
 */
@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    @Mapping(source = "entity.position.description", target = "position")
    Employee toEmployee(AuthorEntity entity);
}
