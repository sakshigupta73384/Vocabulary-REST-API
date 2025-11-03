


package com.demo.vocabapp.service;


import com.demo.vocabapp.dao.VocabRepository;
import com.demo.vocabapp.model.Vocabulary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VocabServiceImpl implements VocabService {
    @Autowired
    VocabRepository vocabRepository;
    @Override
    public Vocabulary save(Vocabulary v) {
        return vocabRepository.save(v);
    }
    @Override
    public Vocabulary update(Vocabulary v) {

        return vocabRepository.save(v);
    }
    @Override
    public Vocabulary findByWord(String word) {
        return vocabRepository.findByWord(word)
                .orElse(null); // returns null if word not found
    }


}
