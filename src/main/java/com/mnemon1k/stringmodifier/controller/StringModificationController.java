package com.mnemon1k.stringmodifier.controller;

import com.mnemon1k.stringmodifier.model.StringModificationRequestModel;
import com.mnemon1k.stringmodifier.model.StringModificationType;
import com.mnemon1k.stringmodifier.modifier.StringModifier;
import com.mnemon1k.stringmodifier.service.StringModificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/modify")
public class StringModificationController {

    StringModificationService modificationService;

    @Autowired
    public StringModificationController(StringModificationService modificationService) {
        this.modificationService = modificationService;
    }

    @PostMapping
    public ResponseEntity<String> modifyString(@RequestBody StringModificationRequestModel request){
        if (request == null || request.getModificationType() == null)
            return ResponseEntity.badRequest().body("Invalid request");

        if (request.getSourceString() == null || request.getSourceString().isBlank())
            return ResponseEntity.ok().build();

        String result = modificationService.modify(request.getSourceString(), request.getModificationType());

        return ResponseEntity.ok(result);
    }

    @GetMapping()
    public Map<StringModificationType, StringModifier> getModificationTypes(){
        return null;
    }
}
