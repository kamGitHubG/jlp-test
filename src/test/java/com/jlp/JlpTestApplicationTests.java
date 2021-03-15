package com.jlp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jlp.controller.ProductController;


@SpringBootTest
class JlpTestApplicationTests {

	@Autowired
	private ProductController productController;

	@Test
	void contextLoads() {
		assertThat(productController).isNotNull();
	}

}
