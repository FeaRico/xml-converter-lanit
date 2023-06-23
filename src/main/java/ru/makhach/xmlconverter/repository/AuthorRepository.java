package ru.makhach.xmlconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.makhach.xmlconverter.model.entity.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, String> {
}
