package ru.makhach.xmlconverter.rules.impl;

import org.springframework.stereotype.Component;
import ru.makhach.xmlconverter.mapper.AuthorMapper;
import ru.makhach.xmlconverter.model.entity.AuthorEntity;
import ru.makhach.xmlconverter.model.entity.TitleEntity;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.model.xml.response.attribute.*;
import ru.makhach.xmlconverter.rules.Rule;
import ru.makhach.xmlconverter.service.LetterDataFacade;
import ru.makhach.xmlconverter.utils.DateUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Обработка {@link Title заголовка письма}
 */
@Component
public class TitleRule implements Rule {
    private final LetterDataFacade dataFacade;

    public TitleRule(LetterDataFacade dataFacade) {
        this.dataFacade = dataFacade;
    }

    @Override
    public void process(RequestLetter letter, ResponseLetter responseLetter) {
        String raceCode = letter.getRaceCode().getValue();
        TitleEntity titleEntity = dataFacade.getTitleByRaceCode(raceCode);

        Title title = new Title();
        title.setDescription(titleEntity.getDescription());
        title.setTheme(new Theme(titleEntity.getTheme()));
        title.setCreated(DateUtils.plusDate(letter.getCreated().getDateTime(), 1, 1, 1));
        title.setAlienRace(new AlienRace(titleEntity.getCode()));
        title.setId(new TitleId("Идентификатор письма", letter.getUid().getCode().getValue()));

        List<Employee> employees = letter.getAuthors().stream().map(author -> {
            AuthorEntity authorEntity = dataFacade.getAuthorById(author.getId().getValue());

            return AuthorMapper.INSTANCE.toEmployee(authorEntity);
        }).collect(Collectors.toList());

        title.setAuthors(employees);

        responseLetter.setTitle(title);
    }
}
