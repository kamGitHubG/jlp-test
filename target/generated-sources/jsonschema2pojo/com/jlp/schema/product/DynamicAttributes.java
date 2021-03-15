
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
 * DynamicAttributes
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "luxuryfabric",
    "dressshape",
    "typeofpattern",
    "dressbyoccasion",
    "fabric",
    "FashionSize"
})
public class DynamicAttributes {

    /**
     * The luxuryfabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("luxuryfabric")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String luxuryfabric = "";
    /**
     * The dressshape schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressshape")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String dressshape = "";
    /**
     * The typeofpattern schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("typeofpattern")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String typeofpattern = "";
    /**
     * The dressbyoccasion schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressbyoccasion")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String dressbyoccasion = "";
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
     * The FashionSize schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FashionSize")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String fashionSize = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The luxuryfabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("luxuryfabric")
    public String getLuxuryfabric() {
        return luxuryfabric;
    }

    /**
     * The luxuryfabric schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("luxuryfabric")
    public void setLuxuryfabric(String luxuryfabric) {
        this.luxuryfabric = luxuryfabric;
    }

    /**
     * The dressshape schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressshape")
    public String getDressshape() {
        return dressshape;
    }

    /**
     * The dressshape schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressshape")
    public void setDressshape(String dressshape) {
        this.dressshape = dressshape;
    }

    /**
     * The typeofpattern schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("typeofpattern")
    public String getTypeofpattern() {
        return typeofpattern;
    }

    /**
     * The typeofpattern schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("typeofpattern")
    public void setTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
    }

    /**
     * The dressbyoccasion schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressbyoccasion")
    public String getDressbyoccasion() {
        return dressbyoccasion;
    }

    /**
     * The dressbyoccasion schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dressbyoccasion")
    public void setDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
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
     * The FashionSize schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FashionSize")
    public String getFashionSize() {
        return fashionSize;
    }

    /**
     * The FashionSize schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FashionSize")
    public void setFashionSize(String fashionSize) {
        this.fashionSize = fashionSize;
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
        sb.append(DynamicAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("luxuryfabric");
        sb.append('=');
        sb.append(((this.luxuryfabric == null)?"<null>":this.luxuryfabric));
        sb.append(',');
        sb.append("dressshape");
        sb.append('=');
        sb.append(((this.dressshape == null)?"<null>":this.dressshape));
        sb.append(',');
        sb.append("typeofpattern");
        sb.append('=');
        sb.append(((this.typeofpattern == null)?"<null>":this.typeofpattern));
        sb.append(',');
        sb.append("dressbyoccasion");
        sb.append('=');
        sb.append(((this.dressbyoccasion == null)?"<null>":this.dressbyoccasion));
        sb.append(',');
        sb.append("fabric");
        sb.append('=');
        sb.append(((this.fabric == null)?"<null>":this.fabric));
        sb.append(',');
        sb.append("fashionSize");
        sb.append('=');
        sb.append(((this.fashionSize == null)?"<null>":this.fashionSize));
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
        result = ((result* 31)+((this.fashionSize == null)? 0 :this.fashionSize.hashCode()));
        result = ((result* 31)+((this.luxuryfabric == null)? 0 :this.luxuryfabric.hashCode()));
        result = ((result* 31)+((this.dressshape == null)? 0 :this.dressshape.hashCode()));
        result = ((result* 31)+((this.typeofpattern == null)? 0 :this.typeofpattern.hashCode()));
        result = ((result* 31)+((this.fabric == null)? 0 :this.fabric.hashCode()));
        result = ((result* 31)+((this.dressbyoccasion == null)? 0 :this.dressbyoccasion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamicAttributes) == false) {
            return false;
        }
        DynamicAttributes rhs = ((DynamicAttributes) other);
        return ((((((((this.fashionSize == rhs.fashionSize)||((this.fashionSize!= null)&&this.fashionSize.equals(rhs.fashionSize)))&&((this.luxuryfabric == rhs.luxuryfabric)||((this.luxuryfabric!= null)&&this.luxuryfabric.equals(rhs.luxuryfabric))))&&((this.dressshape == rhs.dressshape)||((this.dressshape!= null)&&this.dressshape.equals(rhs.dressshape))))&&((this.typeofpattern == rhs.typeofpattern)||((this.typeofpattern!= null)&&this.typeofpattern.equals(rhs.typeofpattern))))&&((this.fabric == rhs.fabric)||((this.fabric!= null)&&this.fabric.equals(rhs.fabric))))&&((this.dressbyoccasion == rhs.dressbyoccasion)||((this.dressbyoccasion!= null)&&this.dressbyoccasion.equals(rhs.dressbyoccasion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
