
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
 * Price
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "was",
    "then1",
    "then2",
    "now",
    "uom",
    "currency"
})
public class Price {

    /**
     * The was schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("was")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String was = "";
    /**
     * The then1 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then1")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String then1 = "";
    /**
     * The then2 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then2")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String then2 = "";
    /**
     * The now schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("now")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String now = "";
    /**
     * The uom schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("uom")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String uom = "";
    /**
     * The currency schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String currency = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The was schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("was")
    public String getWas() {
        return was;
    }

    /**
     * The was schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("was")
    public void setWas(String was) {
        this.was = was;
    }

    /**
     * The then1 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then1")
    public String getThen1() {
        return then1;
    }

    /**
     * The then1 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then1")
    public void setThen1(String then1) {
        this.then1 = then1;
    }

    /**
     * The then2 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then2")
    public String getThen2() {
        return then2;
    }

    /**
     * The then2 schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("then2")
    public void setThen2(String then2) {
        this.then2 = then2;
    }

    /**
     * The now schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("now")
    public String getNow() {
        return now;
    }

    /**
     * The now schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("now")
    public void setNow(String now) {
        this.now = now;
    }

    /**
     * The uom schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("uom")
    public String getUom() {
        return uom;
    }

    /**
     * The uom schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("uom")
    public void setUom(String uom) {
        this.uom = uom;
    }

    /**
     * The currency schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * The currency schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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
        sb.append(Price.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("was");
        sb.append('=');
        sb.append(((this.was == null)?"<null>":this.was));
        sb.append(',');
        sb.append("then1");
        sb.append('=');
        sb.append(((this.then1 == null)?"<null>":this.then1));
        sb.append(',');
        sb.append("then2");
        sb.append('=');
        sb.append(((this.then2 == null)?"<null>":this.then2));
        sb.append(',');
        sb.append("now");
        sb.append('=');
        sb.append(((this.now == null)?"<null>":this.now));
        sb.append(',');
        sb.append("uom");
        sb.append('=');
        sb.append(((this.uom == null)?"<null>":this.uom));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
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
        result = ((result* 31)+((this.uom == null)? 0 :this.uom.hashCode()));
        result = ((result* 31)+((this.then2 == null)? 0 :this.then2 .hashCode()));
        result = ((result* 31)+((this.then1 == null)? 0 :this.then1 .hashCode()));
        result = ((result* 31)+((this.now == null)? 0 :this.now.hashCode()));
        result = ((result* 31)+((this.was == null)? 0 :this.was.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return ((((((((this.uom == rhs.uom)||((this.uom!= null)&&this.uom.equals(rhs.uom)))&&((this.then2 == rhs.then2)||((this.then2 != null)&&this.then2 .equals(rhs.then2))))&&((this.then1 == rhs.then1)||((this.then1 != null)&&this.then1 .equals(rhs.then1))))&&((this.now == rhs.now)||((this.now!= null)&&this.now.equals(rhs.now))))&&((this.was == rhs.was)||((this.was!= null)&&this.was.equals(rhs.was))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
