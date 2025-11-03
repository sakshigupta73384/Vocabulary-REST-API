package com.demo.vocabapp.controller;

import com.demo.vocabapp.model.DifferentLang;
import com.demo.vocabapp.service.DifferentLangService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/words")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class DifferentLangController {

    private final DifferentLangService differentLangService;

    public DifferentLangController(DifferentLangService differentLangService) {
        this.differentLangService = differentLangService; // Spring injects DifferentLangServiceImpl
    }



    @GetMapping("/search")
    public String getMeaningByWord(@RequestParam String word, @RequestParam Integer langId) {
        return differentLangService.getMeaningByWordAndLang(word, langId)
                .map(DifferentLang::getMeaning)
                .orElse("Word not found");
    }


}





