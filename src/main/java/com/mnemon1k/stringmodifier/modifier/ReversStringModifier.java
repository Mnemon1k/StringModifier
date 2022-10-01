package com.mnemon1k.stringmodifier.modifier;

import com.mnemon1k.stringmodifier.model.StringModificationType;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReversStringModifier implements StringModifier {
    StringModificationType type = StringModificationType.REVERS;

    @Override
    public String modify(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
