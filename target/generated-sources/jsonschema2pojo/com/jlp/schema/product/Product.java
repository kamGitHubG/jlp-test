
package com.jlp.schema.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Product
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "type",
    "title",
    "htmlTitle",
    "code",
    "averageRating",
    "reviews",
    "price",
    "image",
    "displaySpecialOffer",
    "promoMessages",
    "nonPromoMessage",
    "defaultSkuId",
    "colorSwatches",
    "colorSwatchSelected",
    "colorWheelMessage",
    "outOfStock",
    "emailMeWhenAvailable",
    "availabilityMessage",
    "compare",
    "fabric",
    "swatchAvailable",
    "categoryQuickViewEnabled",
    "swatchCategoryType",
    "brand",
    "ageRestriction",
    "isInStoreOnly",
    "isMadeToMeasure",
    "isBundle",
    "isProductSet",
    "promotionalFeatures",
    "features",
    "dynamicAttributes",
    "directorate",
    "futureRelease",
    "multiSku",
    "fabricByLength",
    "quickAddToBasket",
    "permanentOos"
})
public class Product {

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productId = "";
    /**
     * The type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String type = "";
    /**
     * The title schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String title = "";
    /**
     * The htmlTitle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("htmlTitle")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String htmlTitle = "";
    /**
     * The code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String code = "";
    /**
     * The averageRating schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("averageRating")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double averageRating = 0.0D;
    /**
     * The reviews schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reviews")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer reviews = 0;
    /**
     * Price
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("price")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Price price;
    /**
     * The image schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String image = "";
    /**
     * The displaySpecialOffer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("displaySpecialOffer")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String displaySpecialOffer = "";
    /**
     * PromoMessages
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promoMessages")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private PromoMessages promoMessages;
    /**
     * The nonPromoMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("nonPromoMessage")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String nonPromoMessage = "";
    /**
     * The defaultSkuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("defaultSkuId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String defaultSkuId = "";
    /**
     * The colorSwatches schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatches")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<ColorSwatch> colorSwatches = new ArrayList<ColorSwatch>();
    /**
     * The colorSwatchSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchSelected")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer colorSwatchSelected = 0;
    /**
     * The colorWheelMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorWheelMessage")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String colorWheelMessage = "";
    /**
     * The outOfStock schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("outOfStock")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean outOfStock = false;
    /**
     * The emailMeWhenAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("emailMeWhenAvailable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean emailMeWhenAvailable = false;
    /**
     * The availabilityMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("availabilityMessage")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String availabilityMessage = "";
    /**
     * The compare schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("compare")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean compare = false;
    /**
     * The fabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabric")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String fabric = "";
    /**
     * The swatchAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchAvailable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean swatchAvailable = false;
    /**
     * The categoryQuickViewEnabled schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("categoryQuickViewEnabled")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean categoryQuickViewEnabled = false;
    /**
     * The swatchCategoryType schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchCategoryType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String swatchCategoryType = "";
    /**
     * The brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("brand")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String brand = "";
    /**
     * The ageRestriction schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ageRestriction")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer ageRestriction = 0;
    /**
     * The isInStoreOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isInStoreOnly")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isInStoreOnly = false;
    /**
     * The isMadeToMeasure schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isMadeToMeasure")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isMadeToMeasure = false;
    /**
     * The isBundle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isBundle")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isBundle = false;
    /**
     * The isProductSet schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isProductSet")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isProductSet = false;
    /**
     * The promotionalFeatures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promotionalFeatures")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Object> promotionalFeatures = new ArrayList<Object>();
    /**
     * The features schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("features")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Object> features = new ArrayList<Object>();
    /**
     * DynamicAttributes
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamicAttributes")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private DynamicAttributes dynamicAttributes;
    /**
     * The directorate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("directorate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String directorate = "";
    /**
     * The futureRelease schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("futureRelease")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean futureRelease = false;
    /**
     * The multiSku schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("multiSku")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean multiSku = false;
    /**
     * The fabricByLength schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabricByLength")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean fabricByLength = false;
    /**
     * QuickAddToBasket
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("quickAddToBasket")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private QuickAddToBasket quickAddToBasket;
    /**
     * The permanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("permanentOos")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean permanentOos = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * The type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The title schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * The title schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The htmlTitle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("htmlTitle")
    public String getHtmlTitle() {
        return htmlTitle;
    }

    /**
     * The htmlTitle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("htmlTitle")
    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    /**
     * The code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * The code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * The averageRating schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("averageRating")
    public Double getAverageRating() {
        return averageRating;
    }

    /**
     * The averageRating schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("averageRating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * The reviews schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reviews")
    public Integer getReviews() {
        return reviews;
    }

    /**
     * The reviews schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reviews")
    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    /**
     * Price
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    /**
     * Price
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * The image schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * The image schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * The displaySpecialOffer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("displaySpecialOffer")
    public String getDisplaySpecialOffer() {
        return displaySpecialOffer;
    }

    /**
     * The displaySpecialOffer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("displaySpecialOffer")
    public void setDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
    }

    /**
     * PromoMessages
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promoMessages")
    public PromoMessages getPromoMessages() {
        return promoMessages;
    }

    /**
     * PromoMessages
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promoMessages")
    public void setPromoMessages(PromoMessages promoMessages) {
        this.promoMessages = promoMessages;
    }

    /**
     * The nonPromoMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("nonPromoMessage")
    public String getNonPromoMessage() {
        return nonPromoMessage;
    }

    /**
     * The nonPromoMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("nonPromoMessage")
    public void setNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
    }

    /**
     * The defaultSkuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("defaultSkuId")
    public String getDefaultSkuId() {
        return defaultSkuId;
    }

    /**
     * The defaultSkuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("defaultSkuId")
    public void setDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    /**
     * The colorSwatches schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatches")
    public List<ColorSwatch> getColorSwatches() {
        return colorSwatches;
    }

    /**
     * The colorSwatches schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatches")
    public void setColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
    }

    /**
     * The colorSwatchSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchSelected")
    public Integer getColorSwatchSelected() {
        return colorSwatchSelected;
    }

    /**
     * The colorSwatchSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchSelected")
    public void setColorSwatchSelected(Integer colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
    }

    /**
     * The colorWheelMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorWheelMessage")
    public String getColorWheelMessage() {
        return colorWheelMessage;
    }

    /**
     * The colorWheelMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorWheelMessage")
    public void setColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
    }

    /**
     * The outOfStock schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("outOfStock")
    public Boolean getOutOfStock() {
        return outOfStock;
    }

    /**
     * The outOfStock schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("outOfStock")
    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    /**
     * The emailMeWhenAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("emailMeWhenAvailable")
    public Boolean getEmailMeWhenAvailable() {
        return emailMeWhenAvailable;
    }

    /**
     * The emailMeWhenAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("emailMeWhenAvailable")
    public void setEmailMeWhenAvailable(Boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
    }

    /**
     * The availabilityMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("availabilityMessage")
    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    /**
     * The availabilityMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("availabilityMessage")
    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    /**
     * The compare schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("compare")
    public Boolean getCompare() {
        return compare;
    }

    /**
     * The compare schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("compare")
    public void setCompare(Boolean compare) {
        this.compare = compare;
    }

    /**
     * The fabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabric")
    public String getFabric() {
        return fabric;
    }

    /**
     * The fabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabric")
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /**
     * The swatchAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchAvailable")
    public Boolean getSwatchAvailable() {
        return swatchAvailable;
    }

    /**
     * The swatchAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchAvailable")
    public void setSwatchAvailable(Boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
    }

    /**
     * The categoryQuickViewEnabled schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("categoryQuickViewEnabled")
    public Boolean getCategoryQuickViewEnabled() {
        return categoryQuickViewEnabled;
    }

    /**
     * The categoryQuickViewEnabled schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("categoryQuickViewEnabled")
    public void setCategoryQuickViewEnabled(Boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
    }

    /**
     * The swatchCategoryType schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchCategoryType")
    public String getSwatchCategoryType() {
        return swatchCategoryType;
    }

    /**
     * The swatchCategoryType schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("swatchCategoryType")
    public void setSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
    }

    /**
     * The brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    /**
     * The brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * The ageRestriction schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ageRestriction")
    public Integer getAgeRestriction() {
        return ageRestriction;
    }

    /**
     * The ageRestriction schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ageRestriction")
    public void setAgeRestriction(Integer ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    /**
     * The isInStoreOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isInStoreOnly")
    public Boolean getIsInStoreOnly() {
        return isInStoreOnly;
    }

    /**
     * The isInStoreOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isInStoreOnly")
    public void setIsInStoreOnly(Boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
    }

    /**
     * The isMadeToMeasure schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isMadeToMeasure")
    public Boolean getIsMadeToMeasure() {
        return isMadeToMeasure;
    }

    /**
     * The isMadeToMeasure schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isMadeToMeasure")
    public void setIsMadeToMeasure(Boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
    }

    /**
     * The isBundle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isBundle")
    public Boolean getIsBundle() {
        return isBundle;
    }

    /**
     * The isBundle schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isBundle")
    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }

    /**
     * The isProductSet schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isProductSet")
    public Boolean getIsProductSet() {
        return isProductSet;
    }

    /**
     * The isProductSet schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isProductSet")
    public void setIsProductSet(Boolean isProductSet) {
        this.isProductSet = isProductSet;
    }

    /**
     * The promotionalFeatures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promotionalFeatures")
    public List<Object> getPromotionalFeatures() {
        return promotionalFeatures;
    }

    /**
     * The promotionalFeatures schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("promotionalFeatures")
    public void setPromotionalFeatures(List<Object> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
    }

    /**
     * The features schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("features")
    public List<Object> getFeatures() {
        return features;
    }

    /**
     * The features schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("features")
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    /**
     * DynamicAttributes
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamicAttributes")
    public DynamicAttributes getDynamicAttributes() {
        return dynamicAttributes;
    }

    /**
     * DynamicAttributes
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamicAttributes")
    public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }

    /**
     * The directorate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("directorate")
    public String getDirectorate() {
        return directorate;
    }

    /**
     * The directorate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("directorate")
    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }

    /**
     * The futureRelease schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("futureRelease")
    public Boolean getFutureRelease() {
        return futureRelease;
    }

    /**
     * The futureRelease schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("futureRelease")
    public void setFutureRelease(Boolean futureRelease) {
        this.futureRelease = futureRelease;
    }

    /**
     * The multiSku schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("multiSku")
    public Boolean getMultiSku() {
        return multiSku;
    }

    /**
     * The multiSku schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("multiSku")
    public void setMultiSku(Boolean multiSku) {
        this.multiSku = multiSku;
    }

    /**
     * The fabricByLength schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabricByLength")
    public Boolean getFabricByLength() {
        return fabricByLength;
    }

    /**
     * The fabricByLength schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("fabricByLength")
    public void setFabricByLength(Boolean fabricByLength) {
        this.fabricByLength = fabricByLength;
    }

    /**
     * QuickAddToBasket
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("quickAddToBasket")
    public QuickAddToBasket getQuickAddToBasket() {
        return quickAddToBasket;
    }

    /**
     * QuickAddToBasket
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("quickAddToBasket")
    public void setQuickAddToBasket(QuickAddToBasket quickAddToBasket) {
        this.quickAddToBasket = quickAddToBasket;
    }

    /**
     * The permanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("permanentOos")
    public Boolean getPermanentOos() {
        return permanentOos;
    }

    /**
     * The permanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("permanentOos")
    public void setPermanentOos(Boolean permanentOos) {
        this.permanentOos = permanentOos;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productId");
        sb.append('=');
        sb.append(((this.productId == null)?"<null>":this.productId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("htmlTitle");
        sb.append('=');
        sb.append(((this.htmlTitle == null)?"<null>":this.htmlTitle));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("averageRating");
        sb.append('=');
        sb.append(((this.averageRating == null)?"<null>":this.averageRating));
        sb.append(',');
        sb.append("reviews");
        sb.append('=');
        sb.append(((this.reviews == null)?"<null>":this.reviews));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("displaySpecialOffer");
        sb.append('=');
        sb.append(((this.displaySpecialOffer == null)?"<null>":this.displaySpecialOffer));
        sb.append(',');
        sb.append("promoMessages");
        sb.append('=');
        sb.append(((this.promoMessages == null)?"<null>":this.promoMessages));
        sb.append(',');
        sb.append("nonPromoMessage");
        sb.append('=');
        sb.append(((this.nonPromoMessage == null)?"<null>":this.nonPromoMessage));
        sb.append(',');
        sb.append("defaultSkuId");
        sb.append('=');
        sb.append(((this.defaultSkuId == null)?"<null>":this.defaultSkuId));
        sb.append(',');
        sb.append("colorSwatches");
        sb.append('=');
        sb.append(((this.colorSwatches == null)?"<null>":this.colorSwatches));
        sb.append(',');
        sb.append("colorSwatchSelected");
        sb.append('=');
        sb.append(((this.colorSwatchSelected == null)?"<null>":this.colorSwatchSelected));
        sb.append(',');
        sb.append("colorWheelMessage");
        sb.append('=');
        sb.append(((this.colorWheelMessage == null)?"<null>":this.colorWheelMessage));
        sb.append(',');
        sb.append("outOfStock");
        sb.append('=');
        sb.append(((this.outOfStock == null)?"<null>":this.outOfStock));
        sb.append(',');
        sb.append("emailMeWhenAvailable");
        sb.append('=');
        sb.append(((this.emailMeWhenAvailable == null)?"<null>":this.emailMeWhenAvailable));
        sb.append(',');
        sb.append("availabilityMessage");
        sb.append('=');
        sb.append(((this.availabilityMessage == null)?"<null>":this.availabilityMessage));
        sb.append(',');
        sb.append("compare");
        sb.append('=');
        sb.append(((this.compare == null)?"<null>":this.compare));
        sb.append(',');
        sb.append("fabric");
        sb.append('=');
        sb.append(((this.fabric == null)?"<null>":this.fabric));
        sb.append(',');
        sb.append("swatchAvailable");
        sb.append('=');
        sb.append(((this.swatchAvailable == null)?"<null>":this.swatchAvailable));
        sb.append(',');
        sb.append("categoryQuickViewEnabled");
        sb.append('=');
        sb.append(((this.categoryQuickViewEnabled == null)?"<null>":this.categoryQuickViewEnabled));
        sb.append(',');
        sb.append("swatchCategoryType");
        sb.append('=');
        sb.append(((this.swatchCategoryType == null)?"<null>":this.swatchCategoryType));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("ageRestriction");
        sb.append('=');
        sb.append(((this.ageRestriction == null)?"<null>":this.ageRestriction));
        sb.append(',');
        sb.append("isInStoreOnly");
        sb.append('=');
        sb.append(((this.isInStoreOnly == null)?"<null>":this.isInStoreOnly));
        sb.append(',');
        sb.append("isMadeToMeasure");
        sb.append('=');
        sb.append(((this.isMadeToMeasure == null)?"<null>":this.isMadeToMeasure));
        sb.append(',');
        sb.append("isBundle");
        sb.append('=');
        sb.append(((this.isBundle == null)?"<null>":this.isBundle));
        sb.append(',');
        sb.append("isProductSet");
        sb.append('=');
        sb.append(((this.isProductSet == null)?"<null>":this.isProductSet));
        sb.append(',');
        sb.append("promotionalFeatures");
        sb.append('=');
        sb.append(((this.promotionalFeatures == null)?"<null>":this.promotionalFeatures));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("dynamicAttributes");
        sb.append('=');
        sb.append(((this.dynamicAttributes == null)?"<null>":this.dynamicAttributes));
        sb.append(',');
        sb.append("directorate");
        sb.append('=');
        sb.append(((this.directorate == null)?"<null>":this.directorate));
        sb.append(',');
        sb.append("futureRelease");
        sb.append('=');
        sb.append(((this.futureRelease == null)?"<null>":this.futureRelease));
        sb.append(',');
        sb.append("multiSku");
        sb.append('=');
        sb.append(((this.multiSku == null)?"<null>":this.multiSku));
        sb.append(',');
        sb.append("fabricByLength");
        sb.append('=');
        sb.append(((this.fabricByLength == null)?"<null>":this.fabricByLength));
        sb.append(',');
        sb.append("quickAddToBasket");
        sb.append('=');
        sb.append(((this.quickAddToBasket == null)?"<null>":this.quickAddToBasket));
        sb.append(',');
        sb.append("permanentOos");
        sb.append('=');
        sb.append(((this.permanentOos == null)?"<null>":this.permanentOos));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.isBundle == null)? 0 :this.isBundle.hashCode()));
        result = ((result* 31)+((this.compare == null)? 0 :this.compare.hashCode()));
        result = ((result* 31)+((this.promotionalFeatures == null)? 0 :this.promotionalFeatures.hashCode()));
        result = ((result* 31)+((this.dynamicAttributes == null)? 0 :this.dynamicAttributes.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.categoryQuickViewEnabled == null)? 0 :this.categoryQuickViewEnabled.hashCode()));
        result = ((result* 31)+((this.defaultSkuId == null)? 0 :this.defaultSkuId.hashCode()));
        result = ((result* 31)+((this.colorWheelMessage == null)? 0 :this.colorWheelMessage.hashCode()));
        result = ((result* 31)+((this.displaySpecialOffer == null)? 0 :this.displaySpecialOffer.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.htmlTitle == null)? 0 :this.htmlTitle.hashCode()));
        result = ((result* 31)+((this.reviews == null)? 0 :this.reviews.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.swatchCategoryType == null)? 0 :this.swatchCategoryType.hashCode()));
        result = ((result* 31)+((this.averageRating == null)? 0 :this.averageRating.hashCode()));
        result = ((result* 31)+((this.directorate == null)? 0 :this.directorate.hashCode()));
        result = ((result* 31)+((this.outOfStock == null)? 0 :this.outOfStock.hashCode()));
        result = ((result* 31)+((this.quickAddToBasket == null)? 0 :this.quickAddToBasket.hashCode()));
        result = ((result* 31)+((this.isProductSet == null)? 0 :this.isProductSet.hashCode()));
        result = ((result* 31)+((this.multiSku == null)? 0 :this.multiSku.hashCode()));
        result = ((result* 31)+((this.brand == null)? 0 :this.brand.hashCode()));
        result = ((result* 31)+((this.availabilityMessage == null)? 0 :this.availabilityMessage.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.isMadeToMeasure == null)? 0 :this.isMadeToMeasure.hashCode()));
        result = ((result* 31)+((this.colorSwatchSelected == null)? 0 :this.colorSwatchSelected.hashCode()));
        result = ((result* 31)+((this.permanentOos == null)? 0 :this.permanentOos.hashCode()));
        result = ((result* 31)+((this.promoMessages == null)? 0 :this.promoMessages.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.futureRelease == null)? 0 :this.futureRelease.hashCode()));
        result = ((result* 31)+((this.swatchAvailable == null)? 0 :this.swatchAvailable.hashCode()));
        result = ((result* 31)+((this.isInStoreOnly == null)? 0 :this.isInStoreOnly.hashCode()));
        result = ((result* 31)+((this.fabricByLength == null)? 0 :this.fabricByLength.hashCode()));
        result = ((result* 31)+((this.emailMeWhenAvailable == null)? 0 :this.emailMeWhenAvailable.hashCode()));
        result = ((result* 31)+((this.colorSwatches == null)? 0 :this.colorSwatches.hashCode()));
        result = ((result* 31)+((this.fabric == null)? 0 :this.fabric.hashCode()));
        result = ((result* 31)+((this.ageRestriction == null)? 0 :this.ageRestriction.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nonPromoMessage == null)? 0 :this.nonPromoMessage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return (((((((((((((((((((((((((((((((((((((((((this.isBundle == rhs.isBundle)||((this.isBundle!= null)&&this.isBundle.equals(rhs.isBundle)))&&((this.compare == rhs.compare)||((this.compare!= null)&&this.compare.equals(rhs.compare))))&&((this.promotionalFeatures == rhs.promotionalFeatures)||((this.promotionalFeatures!= null)&&this.promotionalFeatures.equals(rhs.promotionalFeatures))))&&((this.dynamicAttributes == rhs.dynamicAttributes)||((this.dynamicAttributes!= null)&&this.dynamicAttributes.equals(rhs.dynamicAttributes))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.categoryQuickViewEnabled == rhs.categoryQuickViewEnabled)||((this.categoryQuickViewEnabled!= null)&&this.categoryQuickViewEnabled.equals(rhs.categoryQuickViewEnabled))))&&((this.defaultSkuId == rhs.defaultSkuId)||((this.defaultSkuId!= null)&&this.defaultSkuId.equals(rhs.defaultSkuId))))&&((this.colorWheelMessage == rhs.colorWheelMessage)||((this.colorWheelMessage!= null)&&this.colorWheelMessage.equals(rhs.colorWheelMessage))))&&((this.displaySpecialOffer == rhs.displaySpecialOffer)||((this.displaySpecialOffer!= null)&&this.displaySpecialOffer.equals(rhs.displaySpecialOffer))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.htmlTitle == rhs.htmlTitle)||((this.htmlTitle!= null)&&this.htmlTitle.equals(rhs.htmlTitle))))&&((this.reviews == rhs.reviews)||((this.reviews!= null)&&this.reviews.equals(rhs.reviews))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.swatchCategoryType == rhs.swatchCategoryType)||((this.swatchCategoryType!= null)&&this.swatchCategoryType.equals(rhs.swatchCategoryType))))&&((this.averageRating == rhs.averageRating)||((this.averageRating!= null)&&this.averageRating.equals(rhs.averageRating))))&&((this.directorate == rhs.directorate)||((this.directorate!= null)&&this.directorate.equals(rhs.directorate))))&&((this.outOfStock == rhs.outOfStock)||((this.outOfStock!= null)&&this.outOfStock.equals(rhs.outOfStock))))&&((this.quickAddToBasket == rhs.quickAddToBasket)||((this.quickAddToBasket!= null)&&this.quickAddToBasket.equals(rhs.quickAddToBasket))))&&((this.isProductSet == rhs.isProductSet)||((this.isProductSet!= null)&&this.isProductSet.equals(rhs.isProductSet))))&&((this.multiSku == rhs.multiSku)||((this.multiSku!= null)&&this.multiSku.equals(rhs.multiSku))))&&((this.brand == rhs.brand)||((this.brand!= null)&&this.brand.equals(rhs.brand))))&&((this.availabilityMessage == rhs.availabilityMessage)||((this.availabilityMessage!= null)&&this.availabilityMessage.equals(rhs.availabilityMessage))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.isMadeToMeasure == rhs.isMadeToMeasure)||((this.isMadeToMeasure!= null)&&this.isMadeToMeasure.equals(rhs.isMadeToMeasure))))&&((this.colorSwatchSelected == rhs.colorSwatchSelected)||((this.colorSwatchSelected!= null)&&this.colorSwatchSelected.equals(rhs.colorSwatchSelected))))&&((this.permanentOos == rhs.permanentOos)||((this.permanentOos!= null)&&this.permanentOos.equals(rhs.permanentOos))))&&((this.promoMessages == rhs.promoMessages)||((this.promoMessages!= null)&&this.promoMessages.equals(rhs.promoMessages))))&&((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId))))&&((this.futureRelease == rhs.futureRelease)||((this.futureRelease!= null)&&this.futureRelease.equals(rhs.futureRelease))))&&((this.swatchAvailable == rhs.swatchAvailable)||((this.swatchAvailable!= null)&&this.swatchAvailable.equals(rhs.swatchAvailable))))&&((this.isInStoreOnly == rhs.isInStoreOnly)||((this.isInStoreOnly!= null)&&this.isInStoreOnly.equals(rhs.isInStoreOnly))))&&((this.fabricByLength == rhs.fabricByLength)||((this.fabricByLength!= null)&&this.fabricByLength.equals(rhs.fabricByLength))))&&((this.emailMeWhenAvailable == rhs.emailMeWhenAvailable)||((this.emailMeWhenAvailable!= null)&&this.emailMeWhenAvailable.equals(rhs.emailMeWhenAvailable))))&&((this.colorSwatches == rhs.colorSwatches)||((this.colorSwatches!= null)&&this.colorSwatches.equals(rhs.colorSwatches))))&&((this.fabric == rhs.fabric)||((this.fabric!= null)&&this.fabric.equals(rhs.fabric))))&&((this.ageRestriction == rhs.ageRestriction)||((this.ageRestriction!= null)&&this.ageRestriction.equals(rhs.ageRestriction))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nonPromoMessage == rhs.nonPromoMessage)||((this.nonPromoMessage!= null)&&this.nonPromoMessage.equals(rhs.nonPromoMessage))));
    }

}
