
package com.jlp.schema.product;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PromoMessages
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reducedToClear",
    "priceMatched",
    "offer",
    "customPromotionalMessage",
    "bundleHeadline",
    "customSpecialOffer"
})
public class PromoMessages {

    /**
     * The reducedToClear schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reducedToClear")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean reducedToClear = false;
    /**
     * The priceMatched schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("priceMatched")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String priceMatched = "";
    /**
     * The offer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offer = "";
    /**
     * The customPromotionalMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customPromotionalMessage")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String customPromotionalMessage = "";
    /**
     * The bundleHeadline schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("bundleHeadline")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String bundleHeadline = "";
    /**
     * CustomSpecialOffer
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customSpecialOffer")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private CustomSpecialOffer customSpecialOffer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The reducedToClear schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reducedToClear")
    public Boolean getReducedToClear() {
        return reducedToClear;
    }

    /**
     * The reducedToClear schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("reducedToClear")
    public void setReducedToClear(Boolean reducedToClear) {
        this.reducedToClear = reducedToClear;
    }

    /**
     * The priceMatched schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("priceMatched")
    public String getPriceMatched() {
        return priceMatched;
    }

    /**
     * The priceMatched schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("priceMatched")
    public void setPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
    }

    /**
     * The offer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    public String getOffer() {
        return offer;
    }

    /**
     * The offer schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("offer")
    public void setOffer(String offer) {
        this.offer = offer;
    }

    /**
     * The customPromotionalMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customPromotionalMessage")
    public String getCustomPromotionalMessage() {
        return customPromotionalMessage;
    }

    /**
     * The customPromotionalMessage schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customPromotionalMessage")
    public void setCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
    }

    /**
     * The bundleHeadline schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("bundleHeadline")
    public String getBundleHeadline() {
        return bundleHeadline;
    }

    /**
     * The bundleHeadline schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("bundleHeadline")
    public void setBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
    }

    /**
     * CustomSpecialOffer
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customSpecialOffer")
    public CustomSpecialOffer getCustomSpecialOffer() {
        return customSpecialOffer;
    }

    /**
     * CustomSpecialOffer
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("customSpecialOffer")
    public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOffer) {
        this.customSpecialOffer = customSpecialOffer;
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
        sb.append(PromoMessages.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reducedToClear");
        sb.append('=');
        sb.append(((this.reducedToClear == null)?"<null>":this.reducedToClear));
        sb.append(',');
        sb.append("priceMatched");
        sb.append('=');
        sb.append(((this.priceMatched == null)?"<null>":this.priceMatched));
        sb.append(',');
        sb.append("offer");
        sb.append('=');
        sb.append(((this.offer == null)?"<null>":this.offer));
        sb.append(',');
        sb.append("customPromotionalMessage");
        sb.append('=');
        sb.append(((this.customPromotionalMessage == null)?"<null>":this.customPromotionalMessage));
        sb.append(',');
        sb.append("bundleHeadline");
        sb.append('=');
        sb.append(((this.bundleHeadline == null)?"<null>":this.bundleHeadline));
        sb.append(',');
        sb.append("customSpecialOffer");
        sb.append('=');
        sb.append(((this.customSpecialOffer == null)?"<null>":this.customSpecialOffer));
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
        result = ((result* 31)+((this.offer == null)? 0 :this.offer.hashCode()));
        result = ((result* 31)+((this.customSpecialOffer == null)? 0 :this.customSpecialOffer.hashCode()));
        result = ((result* 31)+((this.bundleHeadline == null)? 0 :this.bundleHeadline.hashCode()));
        result = ((result* 31)+((this.reducedToClear == null)? 0 :this.reducedToClear.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customPromotionalMessage == null)? 0 :this.customPromotionalMessage.hashCode()));
        result = ((result* 31)+((this.priceMatched == null)? 0 :this.priceMatched.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PromoMessages) == false) {
            return false;
        }
        PromoMessages rhs = ((PromoMessages) other);
        return ((((((((this.offer == rhs.offer)||((this.offer!= null)&&this.offer.equals(rhs.offer)))&&((this.customSpecialOffer == rhs.customSpecialOffer)||((this.customSpecialOffer!= null)&&this.customSpecialOffer.equals(rhs.customSpecialOffer))))&&((this.bundleHeadline == rhs.bundleHeadline)||((this.bundleHeadline!= null)&&this.bundleHeadline.equals(rhs.bundleHeadline))))&&((this.reducedToClear == rhs.reducedToClear)||((this.reducedToClear!= null)&&this.reducedToClear.equals(rhs.reducedToClear))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customPromotionalMessage == rhs.customPromotionalMessage)||((this.customPromotionalMessage!= null)&&this.customPromotionalMessage.equals(rhs.customPromotionalMessage))))&&((this.priceMatched == rhs.priceMatched)||((this.priceMatched!= null)&&this.priceMatched.equals(rhs.priceMatched))));
    }

}
