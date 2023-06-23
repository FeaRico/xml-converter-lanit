package ru.makhach.xmlconverter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * JPA-сущность авторов
 */
@Entity
@Table(name = "author")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {
    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String name;

    @Column
    private String secondName;

    @JoinColumn(referencedColumnName = "id")
    @OneToOne
    private PositionEntity position;
}
