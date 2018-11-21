package com.etsmtl.codecrusade.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SupportedType
 */
public enum SupportedType {
  
  BOOLEAN("BOOLEAN"),
  
  INT("INT"),
  
  FLOAT("FLOAT"),
  
  STRING("STRING"),
  
  CHAR("CHAR"),
  
  BOOLEAN_ARRAY("BOOLEAN_ARRAY"),
  
  INT_ARRAY("INT_ARRAY"),
  
  FLOAT_ARRAY("FLOAT_ARRAY"),
  
  STRING_ARRAY("STRING_ARRAY"),
  
  CHAR_ARRAY("CHAR_ARRAY");

  private String value;

  SupportedType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SupportedType fromValue(String text) {
    for (SupportedType b : SupportedType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

