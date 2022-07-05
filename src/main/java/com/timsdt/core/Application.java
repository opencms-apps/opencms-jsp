package com.timsdt.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.timsdt.core.jsonld.Brand;
import com.timsdt.core.jsonld.product.Product;
import com.timsdt.core.jsonld.product.Vehicle;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter writer = objectMapper.writerWithDefaultPrettyPrinter();
        Vehicle product = new Vehicle();
        product.productName = "Example Name";
        product.setBrand(new Brand());
        product.setIsRelatedTo(new Product());

        String personJsonLd = writer.writeValueAsString(product);
        System.out.println(personJsonLd);
    }
}
