package com.mnemon1k.stringmodifier.config;

import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import com.mnemon1k.stringmodifier.modifier.StringModifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class StringModifiersConfiguration {

    @Bean
    public Map<StringModificationTypes, StringModifier> getSupportedTypes(Collection<StringModifier> modifiers){
        Map<StringModificationTypes, StringModifier> supportedModifiers = new HashMap<>();

        if (modifiers != null && !modifiers.isEmpty()){
            for(StringModifier modifier: modifiers){
                supportedModifiers.put(modifier.getType(), modifier);
            }
        }

        return supportedModifiers;
    }
}
