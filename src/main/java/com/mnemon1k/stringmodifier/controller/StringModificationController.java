package com.mnemon1k.stringmodifier.controller;

import com.mnemon1k.stringmodifier.model.StringModificationRequestModel;
import com.mnemon1k.stringmodifier.model.StringModificationType;
import com.mnemon1k.stringmodifier.service.StringModificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

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
    public ResponseEntity<List<StringModificationType>> getModificationTypes(){
        return new ResponseEntity<>(Arrays.asList(StringModificationType.values()), HttpStatus.OK);
    }
}
