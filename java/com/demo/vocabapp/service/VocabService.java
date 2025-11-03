


package com.demo.vocabapp.service;


import com.demo.vocabapp.model.Vocabulary;

import java.util.List;
import java.util.Optional;

public interface VocabService {

    Vocabulary save(Vocabulary v);
    Vocabulary update (Vocabulary v);
//    Vocabulary findById(int id);
  Vocabulary findByWord(String word);
//    Vocabulary deleteById(int id);
//    List<Vocabulary> findAll();
 // List<Vocabulary> findAllVocabularyByWord(String word);
//    List<Vocabulary> findAllVocabularyByModel(String model);

}
