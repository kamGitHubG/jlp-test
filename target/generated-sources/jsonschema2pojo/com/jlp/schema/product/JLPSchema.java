
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
 * JLPSchema
 * <p>
 * The root schema comprises the entire JSON document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "showInStockOnly",
    "products",
    "facets",
    "results",
    "pagesAvailable",
    "crumbs",
    "pageInformation",
    "baseFacetId"
})
public class JLPSchema {

    /**
     * The showInStockOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showInStockOnly")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean showInStockOnly = false;
    /**
     * The products schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("products")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Product> products = new ArrayList<Product>();
    /**
     * The facets schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facets")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Facet> facets = new ArrayList<Facet>();
    /**
     * The results schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer results = 0;
    /**
     * The pagesAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pagesAvailable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer pagesAvailable = 0;
    /**
     * The crumbs schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("crumbs")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Crumb> crumbs = new ArrayList<Crumb>();
    /**
     * PageInformation
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pageInformation")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private PageInformation pageInformation;
    /**
     * The baseFacetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseFacetId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String baseFacetId = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The showInStockOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showInStockOnly")
    public Boolean getShowInStockOnly() {
        return showInStockOnly;
    }

    /**
     * The showInStockOnly schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("showInStockOnly")
    public void setShowInStockOnly(Boolean showInStockOnly) {
        this.showInStockOnly = showInStockOnly;
    }

    /**
     * The products schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * The products schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * The facets schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facets")
    public List<Facet> getFacets() {
        return facets;
    }

    /**
     * The facets schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("facets")
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    /**
     * The results schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("results")
    public Integer getResults() {
        return results;
    }

    /**
     * The results schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("results")
    public void setResults(Integer results) {
        this.results = results;
    }

    /**
     * The pagesAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pagesAvailable")
    public Integer getPagesAvailable() {
        return pagesAvailable;
    }

    /**
     * The pagesAvailable schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pagesAvailable")
    public void setPagesAvailable(Integer pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    /**
     * The crumbs schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("crumbs")
    public List<Crumb> getCrumbs() {
        return crumbs;
    }

    /**
     * The crumbs schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("crumbs")
    public void setCrumbs(List<Crumb> crumbs) {
        this.crumbs = crumbs;
    }

    /**
     * PageInformation
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pageInformation")
    public PageInformation getPageInformation() {
        return pageInformation;
    }

    /**
     * PageInformation
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("pageInformation")
    public void setPageInformation(PageInformation pageInformation) {
        this.pageInformation = pageInformation;
    }

    /**
     * The baseFacetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseFacetId")
    public String getBaseFacetId() {
        return baseFacetId;
    }

    /**
     * The baseFacetId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseFacetId")
    public void setBaseFacetId(String baseFacetId) {
        this.baseFacetId = baseFacetId;
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
        sb.append(JLPSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("showInStockOnly");
        sb.append('=');
        sb.append(((this.showInStockOnly == null)?"<null>":this.showInStockOnly));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("facets");
        sb.append('=');
        sb.append(((this.facets == null)?"<null>":this.facets));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("pagesAvailable");
        sb.append('=');
        sb.append(((this.pagesAvailable == null)?"<null>":this.pagesAvailable));
        sb.append(',');
        sb.append("crumbs");
        sb.append('=');
        sb.append(((this.crumbs == null)?"<null>":this.crumbs));
        sb.append(',');
        sb.append("pageInformation");
        sb.append('=');
        sb.append(((this.pageInformation == null)?"<null>":this.pageInformation));
        sb.append(',');
        sb.append("baseFacetId");
        sb.append('=');
        sb.append(((this.baseFacetId == null)?"<null>":this.baseFacetId));
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
        result = ((result* 31)+((this.baseFacetId == null)? 0 :this.baseFacetId.hashCode()));
        result = ((result* 31)+((this.crumbs == null)? 0 :this.crumbs.hashCode()));
        result = ((result* 31)+((this.pagesAvailable == null)? 0 :this.pagesAvailable.hashCode()));
        result = ((result* 31)+((this.pageInformation == null)? 0 :this.pageInformation.hashCode()));
        result = ((result* 31)+((this.showInStockOnly == null)? 0 :this.showInStockOnly.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.facets == null)? 0 :this.facets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JLPSchema) == false) {
            return false;
        }
        JLPSchema rhs = ((JLPSchema) other);
        return ((((((((((this.baseFacetId == rhs.baseFacetId)||((this.baseFacetId!= null)&&this.baseFacetId.equals(rhs.baseFacetId)))&&((this.crumbs == rhs.crumbs)||((this.crumbs!= null)&&this.crumbs.equals(rhs.crumbs))))&&((this.pagesAvailable == rhs.pagesAvailable)||((this.pagesAvailable!= null)&&this.pagesAvailable.equals(rhs.pagesAvailable))))&&((this.pageInformation == rhs.pageInformation)||((this.pageInformation!= null)&&this.pageInformation.equals(rhs.pageInformation))))&&((this.showInStockOnly == rhs.showInStockOnly)||((this.showInStockOnly!= null)&&this.showInStockOnly.equals(rhs.showInStockOnly))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.facets == rhs.facets)||((this.facets!= null)&&this.facets.equals(rhs.facets))));
    }

}
