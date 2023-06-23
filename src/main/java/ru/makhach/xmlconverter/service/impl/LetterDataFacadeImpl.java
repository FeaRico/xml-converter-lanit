package ru.makhach.xmlconverter.service.impl;

import org.springframework.stereotype.Service;
import ru.makhach.xmlconverter.model.entity.AuthorEntity;
import ru.makhach.xmlconverter.model.entity.TitleEntity;
import ru.makhach.xmlconverter.repository.AuthorRepository;
import ru.makhach.xmlconverter.repository.TitleRepository;
import ru.makhach.xmlconverter.service.LetterDataFacade;

@Service
public class LetterDataFacadeImpl implements LetterDataFacade {
    private final TitleRepository titleRepository;
    private final AuthorRepository authorRepository;

    public LetterDataFacadeImpl(TitleRepository titleRepository, AuthorRepository authorRepository) {
        this.titleRepository = titleRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public TitleEntity getTitleByRaceCode(String code) {
        return titleRepository.findById(code)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public AuthorEntity getAuthorById(String id) {
        return authorRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }
}
