

package com.demo.vocabapp.service;

import com.demo.vocabapp.model.DifferentLang;
import java.util.Optional;

public interface DifferentLangService {



    Optional<DifferentLang> getMeaningByWordAndLang(String word, Integer langId);

}



