package com.demo.vocabapp.controller;

import com.demo.vocabapp.model.Language;
import com.demo.vocabapp.service.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @PostMapping
    public Language addLanguage(@RequestBody Language language) {
        return languageService.saveLanguage(language);
    }
}
