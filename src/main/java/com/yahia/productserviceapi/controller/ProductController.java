package com.yahia.productserviceapi.controller;

import com.yahia.productserviceapi.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    //types of http methods GET, POST, DELETE, PUT
    //Pathvariable /product/{productId}

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable Integer productId){
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("Product "+productId);
        product.setPrice(100);
        product.setWeight(23);

        return product;
    }

    //RequestParam /product?productId=12
    @GetMapping("/product")
    public Product getProductSample2(@RequestParam Integer productId){


        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("Product "+productId);
        product.setPrice(100);
        product.setWeight(23);

        return product;
    }







}
