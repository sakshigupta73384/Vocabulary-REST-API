package com.demo.vocabapp.service;

import com.demo.vocabapp.dao.LanguageRepository;
import com.demo.vocabapp.model.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService{
    private final LanguageRepository languageRepo;


    public LanguageServiceImpl(LanguageRepository languageRepo) {
        this.languageRepo = languageRepo;
    }
    @Override
    public List<Language> getAllLanguages(){
        return languageRepo.findAll();
    }

    @Override
    public Language saveLanguage(Language language) {
        return languageRepo.save(language);
    }


}
