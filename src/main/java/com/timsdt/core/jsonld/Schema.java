package com.timsdt.core.jsonld;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Schema {
    public enum Types {
        Brand, Product, PropertyValue, AggregateRating, Audience, Country, PhysicalActivityCategory, Organization,
        CategoryCode, Thing, Distance, QuantitativeValue, Grant, AdultOrientedEnumeration, EnergyConsumptionDetails,
        MerchantReturnPolicy, Service, ProductGroup, ProductModel, DefinedTerm, IndividualProduct, ProductCollection,
        SomeProducts, Vehicle
    }

    @JsonProperty("@context")
    public String getContext() {
        return "https://schema.org/";
    }

    public abstract Types getType();
}
