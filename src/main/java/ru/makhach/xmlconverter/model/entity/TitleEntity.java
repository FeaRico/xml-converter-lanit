package ru.makhach.xmlconverter.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JPA-сущность заголовков письма
 */
@Entity
@Table(name = "title")
@Getter
@Setter
public class TitleEntity {
    @Id
    private String code;
    @Column
    private String description;
    @Column
    private String theme;
}
