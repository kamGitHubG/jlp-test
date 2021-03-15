
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
 * QuickAddToBasket
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "showPermanentOos",
    "showMoreInfoRedirectPDP",
    "simpleAddToBasket",
    "simpleMobileEmailMe",
    "showEmailMeTriggerQV",
    "showChooseSizeTriggerQV"
})
public class QuickAddToBasket {

    /**
     * The showPermanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showPermanentOos")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean showPermanentOos = false;
    /**
     * The showMoreInfoRedirectPDP schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showMoreInfoRedirectPDP")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean showMoreInfoRedirectPDP = false;
    /**
     * The simpleAddToBasket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleAddToBasket")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean simpleAddToBasket = false;
    /**
     * The simpleMobileEmailMe schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleMobileEmailMe")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean simpleMobileEmailMe = false;
    /**
     * The showEmailMeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showEmailMeTriggerQV")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean showEmailMeTriggerQV = false;
    /**
     * The showChooseSizeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showChooseSizeTriggerQV")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean showChooseSizeTriggerQV = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The showPermanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showPermanentOos")
    public Boolean getShowPermanentOos() {
        return showPermanentOos;
    }

    /**
     * The showPermanentOos schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showPermanentOos")
    public void setShowPermanentOos(Boolean showPermanentOos) {
        this.showPermanentOos = showPermanentOos;
    }

    /**
     * The showMoreInfoRedirectPDP schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showMoreInfoRedirectPDP")
    public Boolean getShowMoreInfoRedirectPDP() {
        return showMoreInfoRedirectPDP;
    }

    /**
     * The showMoreInfoRedirectPDP schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showMoreInfoRedirectPDP")
    public void setShowMoreInfoRedirectPDP(Boolean showMoreInfoRedirectPDP) {
        this.showMoreInfoRedirectPDP = showMoreInfoRedirectPDP;
    }

    /**
     * The simpleAddToBasket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleAddToBasket")
    public Boolean getSimpleAddToBasket() {
        return simpleAddToBasket;
    }

    /**
     * The simpleAddToBasket schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleAddToBasket")
    public void setSimpleAddToBasket(Boolean simpleAddToBasket) {
        this.simpleAddToBasket = simpleAddToBasket;
    }

    /**
     * The simpleMobileEmailMe schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleMobileEmailMe")
    public Boolean getSimpleMobileEmailMe() {
        return simpleMobileEmailMe;
    }

    /**
     * The simpleMobileEmailMe schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("simpleMobileEmailMe")
    public void setSimpleMobileEmailMe(Boolean simpleMobileEmailMe) {
        this.simpleMobileEmailMe = simpleMobileEmailMe;
    }

    /**
     * The showEmailMeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showEmailMeTriggerQV")
    public Boolean getShowEmailMeTriggerQV() {
        return showEmailMeTriggerQV;
    }

    /**
     * The showEmailMeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showEmailMeTriggerQV")
    public void setShowEmailMeTriggerQV(Boolean showEmailMeTriggerQV) {
        this.showEmailMeTriggerQV = showEmailMeTriggerQV;
    }

    /**
     * The showChooseSizeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showChooseSizeTriggerQV")
    public Boolean getShowChooseSizeTriggerQV() {
        return showChooseSizeTriggerQV;
    }

    /**
     * The showChooseSizeTriggerQV schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showChooseSizeTriggerQV")
    public void setShowChooseSizeTriggerQV(Boolean showChooseSizeTriggerQV) {
        this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
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
        sb.append(QuickAddToBasket.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("showPermanentOos");
        sb.append('=');
        sb.append(((this.showPermanentOos == null)?"<null>":this.showPermanentOos));
        sb.append(',');
        sb.append("showMoreInfoRedirectPDP");
        sb.append('=');
        sb.append(((this.showMoreInfoRedirectPDP == null)?"<null>":this.showMoreInfoRedirectPDP));
        sb.append(',');
        sb.append("simpleAddToBasket");
        sb.append('=');
        sb.append(((this.simpleAddToBasket == null)?"<null>":this.simpleAddToBasket));
        sb.append(',');
        sb.append("simpleMobileEmailMe");
        sb.append('=');
        sb.append(((this.simpleMobileEmailMe == null)?"<null>":this.simpleMobileEmailMe));
        sb.append(',');
        sb.append("showEmailMeTriggerQV");
        sb.append('=');
        sb.append(((this.showEmailMeTriggerQV == null)?"<null>":this.showEmailMeTriggerQV));
        sb.append(',');
        sb.append("showChooseSizeTriggerQV");
        sb.append('=');
        sb.append(((this.showChooseSizeTriggerQV == null)?"<null>":this.showChooseSizeTriggerQV));
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
        result = ((result* 31)+((this.simpleAddToBasket == null)? 0 :this.simpleAddToBasket.hashCode()));
        result = ((result* 31)+((this.showEmailMeTriggerQV == null)? 0 :this.showEmailMeTriggerQV.hashCode()));
        result = ((result* 31)+((this.showChooseSizeTriggerQV == null)? 0 :this.showChooseSizeTriggerQV.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.showPermanentOos == null)? 0 :this.showPermanentOos.hashCode()));
        result = ((result* 31)+((this.simpleMobileEmailMe == null)? 0 :this.simpleMobileEmailMe.hashCode()));
        result = ((result* 31)+((this.showMoreInfoRedirectPDP == null)? 0 :this.showMoreInfoRedirectPDP.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickAddToBasket) == false) {
            return false;
        }
        QuickAddToBasket rhs = ((QuickAddToBasket) other);
        return ((((((((this.simpleAddToBasket == rhs.simpleAddToBasket)||((this.simpleAddToBasket!= null)&&this.simpleAddToBasket.equals(rhs.simpleAddToBasket)))&&((this.showEmailMeTriggerQV == rhs.showEmailMeTriggerQV)||((this.showEmailMeTriggerQV!= null)&&this.showEmailMeTriggerQV.equals(rhs.showEmailMeTriggerQV))))&&((this.showChooseSizeTriggerQV == rhs.showChooseSizeTriggerQV)||((this.showChooseSizeTriggerQV!= null)&&this.showChooseSizeTriggerQV.equals(rhs.showChooseSizeTriggerQV))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.showPermanentOos == rhs.showPermanentOos)||((this.showPermanentOos!= null)&&this.showPermanentOos.equals(rhs.showPermanentOos))))&&((this.simpleMobileEmailMe == rhs.simpleMobileEmailMe)||((this.simpleMobileEmailMe!= null)&&this.simpleMobileEmailMe.equals(rhs.simpleMobileEmailMe))))&&((this.showMoreInfoRedirectPDP == rhs.showMoreInfoRedirectPDP)||((this.showMoreInfoRedirectPDP!= null)&&this.showMoreInfoRedirectPDP.equals(rhs.showMoreInfoRedirectPDP))));
    }

}
