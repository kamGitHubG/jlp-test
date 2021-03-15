
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
 * PageInformation
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "noIndex",
    "noFollow"
})
public class PageInformation {

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
     * The noIndex schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean noIndex = false;
    /**
     * The noFollow schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noFollow")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean noFollow = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The noIndex schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noIndex")
    public Boolean getNoIndex() {
        return noIndex;
    }

    /**
     * The noIndex schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noIndex")
    public void setNoIndex(Boolean noIndex) {
        this.noIndex = noIndex;
    }

    /**
     * The noFollow schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noFollow")
    public Boolean getNoFollow() {
        return noFollow;
    }

    /**
     * The noFollow schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("noFollow")
    public void setNoFollow(Boolean noFollow) {
        this.noFollow = noFollow;
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
        sb.append(PageInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("noIndex");
        sb.append('=');
        sb.append(((this.noIndex == null)?"<null>":this.noIndex));
        sb.append(',');
        sb.append("noFollow");
        sb.append('=');
        sb.append(((this.noFollow == null)?"<null>":this.noFollow));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.noFollow == null)? 0 :this.noFollow.hashCode()));
        result = ((result* 31)+((this.noIndex == null)? 0 :this.noIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageInformation) == false) {
            return false;
        }
        PageInformation rhs = ((PageInformation) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.noFollow == rhs.noFollow)||((this.noFollow!= null)&&this.noFollow.equals(rhs.noFollow))))&&((this.noIndex == rhs.noIndex)||((this.noIndex!= null)&&this.noIndex.equals(rhs.noIndex))));
    }

}
