package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Collateral {
    @JsonProperty( value = "Id")
    public Long Id;

    @JsonProperty(value = "property_name")
    public String propertyName;

    @JsonProperty(value = "status")
    public String status;

    @JsonProperty(value = "borrowersName")
    public String borrowersName;

    @JsonProperty(value = "condition")
    public String condition;

    @JsonProperty(value = "property_value")
    public Long property_value;

    public Collateral(){}
}
