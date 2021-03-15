package com.jlp.service;

import java.util.List;

import com.jlp.dto.ProductDTO;

/**
 * 
 * @author kamlesh.ramrakhani Primary interface in the application to provide
 *         the mapping between JLP Product object to response ProductDTO object.
 */
public interface IProductService {

	public List<ProductDTO> getReducedProducts();
	public List<ProductDTO> getReducedProducts(String labelType);

}
