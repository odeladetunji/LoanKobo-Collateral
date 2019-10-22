package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ID {

    @JsonProperty(value = "Id")
    public Long Id;

}
