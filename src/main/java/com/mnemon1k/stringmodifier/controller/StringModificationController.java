package com.mnemon1k.stringmodifier.controller;

import com.mnemon1k.stringmodifier.model.StringModificationRequestModel;
import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import com.mnemon1k.stringmodifier.service.StringModificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class StringModificationController {

    StringModificationService modificationService;

    @Autowired
    public StringModificationController(StringModificationService modificationService) {
        this.modificationService = modificationService;
    }

    @PostMapping("/modify")
    public ResponseEntity<Object> modifyString(@RequestBody StringModificationRequestModel request){
        if (request == null || request.getModificationType() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if (request.getSourceString() == null || request.getSourceString().isBlank())
            return ResponseEntity.ok().build();

        String result = modificationService.modify(request.getSourceString(), request.getModificationType());

        return ResponseEntity.ok(result);
    }

    @GetMapping("/modifications")
    public ResponseEntity<List<StringModificationTypes>> getModificationTypes(){
        return new ResponseEntity<>(Arrays.asList(StringModificationTypes.values()), HttpStatus.OK);
    }

}
