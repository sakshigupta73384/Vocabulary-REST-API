package com.demo.vocabapp.service;

import com.demo.vocabapp.dao.LanguageRepository;
import com.demo.vocabapp.model.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAllLanguages();

    Language saveLanguage(Language language);
}
