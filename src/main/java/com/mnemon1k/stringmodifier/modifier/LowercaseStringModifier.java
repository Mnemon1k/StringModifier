package com.mnemon1k.stringmodifier.modifier;

import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LowercaseStringModifier implements StringModifier {
    StringModificationTypes type = StringModificationTypes.LOWERCASE;

    @Override
    public String modify(String source) {
        return source.toLowerCase();
    }
}
