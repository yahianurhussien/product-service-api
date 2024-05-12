package com.yahia.productserviceapi.service;

import com.yahia.productserviceapi.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService {

    public Product getProduct(int productId){
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("Product "+productId);
        product.setPrice(100);
        product.setWeight(23);

        return product;
    }
}
