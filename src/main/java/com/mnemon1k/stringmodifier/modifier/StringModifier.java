package com.mnemon1k.stringmodifier.modifier;


import com.mnemon1k.stringmodifier.model.StringModificationType;

public interface StringModifier {
    StringModificationType getType();

    String modify(String source);
}
