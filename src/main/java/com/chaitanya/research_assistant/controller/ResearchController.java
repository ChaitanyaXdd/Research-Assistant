package com.chaitanya.research_assistant.controller;


import com.chaitanya.research_assistant.entity.ResearchRequest;
import com.chaitanya.research_assistant.service.ResearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
public class ResearchController {
    private final ResearchService researchService;

    public ResearchController(ResearchService researchService) {
        this.researchService = researchService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest researchRequest){
        String result = researchService.processContent(researchRequest);
        return ResponseEntity.ok(result);

    }
}
