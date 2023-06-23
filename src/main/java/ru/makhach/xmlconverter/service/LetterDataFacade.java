package ru.makhach.xmlconverter.service;

import ru.makhach.xmlconverter.model.entity.AuthorEntity;
import ru.makhach.xmlconverter.model.entity.TitleEntity;

public interface LetterDataFacade {
    TitleEntity getTitleByRaceCode(String code);

    AuthorEntity getAuthorById(String id);
}
