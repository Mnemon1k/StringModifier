package com.mnemon1k.stringmodifier.model;

import lombok.Data;

@Data
public class StringModificationRequestModel {
    String sourceString;
    StringModificationType modificationType;
}
