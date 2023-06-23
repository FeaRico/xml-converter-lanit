package ru.makhach.xmlconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.makhach.xmlconverter.model.entity.TitleEntity;

public interface TitleRepository extends JpaRepository<TitleEntity, String> {
}
