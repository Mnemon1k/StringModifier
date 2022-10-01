package com.mnemon1k.stringmodifier.modifier;


import com.mnemon1k.stringmodifier.model.StringModificationTypes;

public interface StringModifier {
    StringModificationTypes getType();

    String modify(String source);
}
