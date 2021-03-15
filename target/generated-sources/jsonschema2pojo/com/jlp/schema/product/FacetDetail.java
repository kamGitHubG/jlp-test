
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
 * FacetDetail
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facetId",
    "label",
    "qty",
    "color",
    "colorSwatchUrl",
    "isSelected"
})
public class FacetDetail {

    /**
     * The facetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facetId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String facetId = "";
    /**
     * The label schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String label = "";
    /**
     * The qty schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("qty")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String qty = "";
    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String color = "";
    /**
     * The colorSwatchUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchUrl")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String colorSwatchUrl = "";
    /**
     * The isSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isSelected")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String isSelected = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The facetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facetId")
    public String getFacetId() {
        return facetId;
    }

    /**
     * The facetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facetId")
    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

    /**
     * The label schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * The label schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The qty schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("qty")
    public String getQty() {
        return qty;
    }

    /**
     * The qty schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("qty")
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The colorSwatchUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchUrl")
    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    /**
     * The colorSwatchUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("colorSwatchUrl")
    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    /**
     * The isSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isSelected")
    public String getIsSelected() {
        return isSelected;
    }

    /**
     * The isSelected schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isSelected")
    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
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
        sb.append(FacetDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("facetId");
        sb.append('=');
        sb.append(((this.facetId == null)?"<null>":this.facetId));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("colorSwatchUrl");
        sb.append('=');
        sb.append(((this.colorSwatchUrl == null)?"<null>":this.colorSwatchUrl));
        sb.append(',');
        sb.append("isSelected");
        sb.append('=');
        sb.append(((this.isSelected == null)?"<null>":this.isSelected));
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
        result = ((result* 31)+((this.colorSwatchUrl == null)? 0 :this.colorSwatchUrl.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.facetId == null)? 0 :this.facetId.hashCode()));
        result = ((result* 31)+((this.qty == null)? 0 :this.qty.hashCode()));
        result = ((result* 31)+((this.isSelected == null)? 0 :this.isSelected.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacetDetail) == false) {
            return false;
        }
        FacetDetail rhs = ((FacetDetail) other);
        return ((((((((this.colorSwatchUrl == rhs.colorSwatchUrl)||((this.colorSwatchUrl!= null)&&this.colorSwatchUrl.equals(rhs.colorSwatchUrl)))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.facetId == rhs.facetId)||((this.facetId!= null)&&this.facetId.equals(rhs.facetId))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.isSelected == rhs.isSelected)||((this.isSelected!= null)&&this.isSelected.equals(rhs.isSelected))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
