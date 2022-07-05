package com.timsdt.core.jsonld.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.timsdt.core.jsonld.*;
import com.timsdt.core.jsonld.adultorientedenumeration.AdultOrientedEnumeration;
import com.timsdt.core.jsonld.date.Date;
import com.timsdt.core.jsonld.energyconsumptiondetails.EnergyConsumptionDetails;
import com.timsdt.core.jsonld.text.Text;
import com.timsdt.core.jsonld.url.URL;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends Schema {
    @JsonProperty("@type")
    public Types getType() {
        return Types.Product;
    }

    @JsonProperty("name")
    public String productName;

    public PropertyValue additionalProperty;
    public AggregateRating aggregateRating;
    public Audience audience;
    public Text award;
    @JsonProperty("brand")
    private Object brand;
    public Thing category;
    public Text color;
    public Text countryOfAssembly;
    public Text countryOfLastProcessing;
    public Country country;
    public Distance depth;
    public Grant funding;
    public Text gtin;
    public Text gtin12;
    public Text gtin13;
    public Text gtin14;
    public Text gtin8;
    public AdultOrientedEnumeration hasAdultConsideration;
    public EnergyConsumptionDetails hasEnergyConsumptionDetails;
    public QuantitativeValue hasMeasurement;
    public MerchantReturnPolicy hasMerchantReturnPolicy;
    private Object height;
    public Text inProductGroupWithID;
    public Product isAccessoryOrSparePartFor;
    public Product isConsumableFor;
    public Boolean isFamilyFriendly;

    private Object isRelatedTo;
    private Object isSimilarTo;
    private Object isVariantOf;
    private OfferItemCondition itemCondition;
    private Object keywords;
    private Object logo;
    private Organization manufacturer;
    private Object material;
    private Object model;
    private Text mpn;
    private Text nsn;
    private Object offers;
    private Object pattern;
    private Text productId;
    private Date productionDate;
    private Date purchaseDate;
    private Date releaseDate;
    public Review review;
    private Object size;
    public Text sku;
    public Text slogan;
    public QuantitativeValue weight;
    private Object width;
    public URL additionalType;
    public Text alternateName;
    public Text description;
    public Text disambiguatingDescription;
    private Object identifier;
    private Object image;
    private Object mainEntityOfPage;
    public Action potentialAction;
    public URL sameAs;
    private Object subjectOf;
    public URL url;











    public Object getIsRelatedTo() {
        return isRelatedTo;
    }

    public void setIsRelatedTo(Service service) {
        this.isRelatedTo = service;
    }

    public void setIsRelatedTo(Product product) {
        this.isRelatedTo = product;
    }

    public Object getIsSimilarTo() {
        return isSimilarTo;
    }

    public void setIsSimilarTo(Product product) {
        this.isSimilarTo = product;
    }

    public void setIsSimilarTo(Service service) {
        this.isSimilarTo = service;
    }

    public Object getIsVariantOf() {
        return isVariantOf;
    }

    public void setIsVariantOf(ProductGroup productGroup) {
        this.isVariantOf = productGroup;
    }

    public void setIsVariantOf(ProductModel productModel) {
        this.isVariantOf = productModel;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Distance height) {
        this.height = height;
    }

    public void setHeight(QuantitativeValue height) {
        this.height = height;
    }

    public void setKeywords(DefinedTerm definedTerm) {
        this.keywords = definedTerm;
    }

    public void setKeywords(Text text) {
        this.keywords = text;
    }

    public void setKeywords(URL url) {
        this.keywords = url;
    }

    public void setLogo(ImageObject logo) {
        this.logo = logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }

    public void setMaterial(Product product) {
        this.material = product;
    }

    public void setMaterial(Text text) {
        this.material = text;
    }

    public void setMaterial(URL url) {
        this.material = url;
    }

    public void setModel(ProductModel productModel) {
        this.model = productModel;
    }

    public void setModel(Text text) {
        this.model = text;
    }

    public void setOffers(Demand demand) {
        this.offers = demand;
    }

    public void setOffers(Offer offer) {
        this.offers = offer;
    }

    public void setPattern(DefinedTerm term) {
        this.pattern = term;
    }

    public void setPattern(Text text) {
        this.pattern = text;
    }

    public void setBrand(Organization organization) {
        this.brand = organization;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setWidth(Distance width) {
        this.width = width;
    }

    public void setWidth(QuantitativeValue width) {
        this.width = width;
    }
}
