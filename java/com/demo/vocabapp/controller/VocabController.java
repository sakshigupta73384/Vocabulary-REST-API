
package com.demo.vocabapp.controller;
import com.demo.vocabapp.model.Vocabulary;
import com.demo.vocabapp.service.VocabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5501") // allow frontend access
public class VocabController {
@Autowired
    private VocabService vocabService;

     @PostMapping("/save")
public Vocabulary save(@RequestBody  Vocabulary v){
         vocabService.save(v);
         return v;
     }

     @PutMapping("/update")
     public Vocabulary update(@RequestBody  Vocabulary v){
         vocabService.update(v);
         return v;
     }

    @GetMapping("/word/{word}")
    public ResponseEntity<Vocabulary> getVocabularyByWord(@PathVariable String word) {
        Vocabulary vocab = vocabService.findByWord(word);
        if (vocab != null) {
            return ResponseEntity.ok(vocab);
        } else {
            return ResponseEntity.notFound().build();
        }

    }}


