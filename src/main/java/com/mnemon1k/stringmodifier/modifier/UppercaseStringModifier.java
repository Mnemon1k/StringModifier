package com.mnemon1k.stringmodifier.modifier;

import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UppercaseStringModifier implements StringModifier {
    StringModificationTypes type = StringModificationTypes.UPPERCASE;

    @Override
    public String modify(String source) {
        return source.toUpperCase();
    }
}
