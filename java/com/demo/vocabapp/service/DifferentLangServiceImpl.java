


package com.demo.vocabapp.service;

import com.demo.vocabapp.model.DifferentLang;
import com.demo.vocabapp.dao.DifferentLangRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DifferentLangServiceImpl implements DifferentLangService {

    private final DifferentLangRepository differentLangRepository;

    public DifferentLangServiceImpl(DifferentLangRepository differentLangRepository) {
        this.differentLangRepository = differentLangRepository;
    }

//
    @Override
    public Optional<DifferentLang> getMeaningByWordAndLang(String word, Integer langId) {
        return differentLangRepository.findByWordAndLanguage_LangId(word, langId);

    }

}
