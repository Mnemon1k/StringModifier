package com.mnemon1k.stringmodifier.modifier;

import com.mnemon1k.stringmodifier.model.StringModificationType;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UppercaseStringModifier implements StringModifier {
    StringModificationType type = StringModificationType.UPPERCASE;

    @Override
    public String modify(String source) {
        return source.toUpperCase();
    }
}
