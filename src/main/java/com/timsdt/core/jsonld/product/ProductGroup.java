package com.timsdt.core.jsonld.product;

import com.timsdt.core.jsonld.Schema;

public class ProductGroup extends Product {
    @Override
    public Types getType() {
        return Types.ProductGroup;
    }
}
