package ru.makhach.xmlconverter.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.service.ConvertService;

@RestController
@RequestMapping("api/v1/alien")
public class AlienController {
    private final ConvertService convertService;

    public AlienController(ConvertService convertService) {
        this.convertService = convertService;
    }

    @PostMapping(
            value = "/xml",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public ResponseEntity<ResponseLetter> processLetter(@RequestBody RequestLetter letter) {
        return ResponseEntity.ok(convertService.convert(letter));
    }
}
