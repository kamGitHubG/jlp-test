
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
 * ColorSwatch
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "color",
    "basicColor",
    "colorSwatchUrl",
    "imageUrl",
    "isAvailable",
    "skuId"
})
public class ColorSwatch {

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
     * The basicColor schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("basicColor")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String basicColor = "";
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
     * The imageUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String imageUrl = "";
    /**
     * The isAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isAvailable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isAvailable = false;
    /**
     * The skuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("skuId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String skuId = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The basicColor schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("basicColor")
    public String getBasicColor() {
        return basicColor;
    }

    /**
     * The basicColor schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("basicColor")
    public void setBasicColor(String basicColor) {
        this.basicColor = basicColor;
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
     * The imageUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * The imageUrl schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * The isAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * The isAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * The skuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("skuId")
    public String getSkuId() {
        return skuId;
    }

    /**
     * The skuId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("skuId")
    public void setSkuId(String skuId) {
        this.skuId = skuId;
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
        sb.append(ColorSwatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("basicColor");
        sb.append('=');
        sb.append(((this.basicColor == null)?"<null>":this.basicColor));
        sb.append(',');
        sb.append("colorSwatchUrl");
        sb.append('=');
        sb.append(((this.colorSwatchUrl == null)?"<null>":this.colorSwatchUrl));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("isAvailable");
        sb.append('=');
        sb.append(((this.isAvailable == null)?"<null>":this.isAvailable));
        sb.append(',');
        sb.append("skuId");
        sb.append('=');
        sb.append(((this.skuId == null)?"<null>":this.skuId));
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
        result = ((result* 31)+((this.basicColor == null)? 0 :this.basicColor.hashCode()));
        result = ((result* 31)+((this.isAvailable == null)? 0 :this.isAvailable.hashCode()));
        result = ((result* 31)+((this.colorSwatchUrl == null)? 0 :this.colorSwatchUrl.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.skuId == null)? 0 :this.skuId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ColorSwatch) == false) {
            return false;
        }
        ColorSwatch rhs = ((ColorSwatch) other);
        return ((((((((this.basicColor == rhs.basicColor)||((this.basicColor!= null)&&this.basicColor.equals(rhs.basicColor)))&&((this.isAvailable == rhs.isAvailable)||((this.isAvailable!= null)&&this.isAvailable.equals(rhs.isAvailable))))&&((this.colorSwatchUrl == rhs.colorSwatchUrl)||((this.colorSwatchUrl!= null)&&this.colorSwatchUrl.equals(rhs.colorSwatchUrl))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.skuId == rhs.skuId)||((this.skuId!= null)&&this.skuId.equals(rhs.skuId))));
    }

}
