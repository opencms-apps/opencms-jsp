package com.timsdt.core.jsonld.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SomeProducts extends Product {
    @JsonProperty("@type")
    public Types getType() {
        return Types.SomeProducts;
    }
}
