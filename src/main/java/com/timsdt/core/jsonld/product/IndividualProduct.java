package com.timsdt.core.jsonld.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualProduct extends Product {
    @JsonProperty("@type")
    public Types getType() {
        return Types.IndividualProduct;
    }
}
