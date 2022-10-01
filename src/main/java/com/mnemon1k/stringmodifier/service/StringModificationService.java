package com.mnemon1k.stringmodifier.service;

import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import com.mnemon1k.stringmodifier.modifier.StringModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StringModificationService {
    Map<StringModificationTypes, StringModifier> supportedModifiers;

    @Autowired
    public StringModificationService(Map<StringModificationTypes, StringModifier> supportedModifiers) {
        this.supportedModifiers = supportedModifiers;
    }

    public String modify(String sourceString, StringModificationTypes modificationType) {
        return supportedModifiers.get(modificationType).modify(sourceString);
    }
}
