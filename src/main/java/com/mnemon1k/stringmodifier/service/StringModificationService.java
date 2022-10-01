package com.mnemon1k.stringmodifier.service;

import com.mnemon1k.stringmodifier.model.StringModificationType;
import com.mnemon1k.stringmodifier.modifier.StringModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StringModificationService {
    Map<StringModificationType, StringModifier> supportedModifiers;

    @Autowired
    public StringModificationService(Map<StringModificationType, StringModifier> supportedModifiers) {
        this.supportedModifiers = supportedModifiers;
    }

    public String modify(String sourceString, StringModificationType modificationType) {
        return supportedModifiers.get(modificationType).modify(sourceString);
    }
}
