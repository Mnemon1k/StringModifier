package com.mnemon1k.stringmodifier.modifier;

import com.mnemon1k.stringmodifier.model.StringModificationTypes;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReversStringModifier implements StringModifier {
    StringModificationTypes type = StringModificationTypes.REVERS;

    @Override
    public String modify(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
