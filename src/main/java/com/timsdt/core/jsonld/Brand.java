package com.timsdt.core.jsonld;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand extends Schema {
    @JsonProperty("@type")
    public Types getType() {
        return Types.Brand;
    }

    @JsonProperty("name")
    public String brandName;
}
