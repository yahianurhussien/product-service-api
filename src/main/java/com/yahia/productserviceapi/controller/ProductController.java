package com.yahia.productserviceapi.controller;

import com.yahia.productserviceapi.model.Product;
import com.yahia.productserviceapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;



    //types of http methods GET, POST, DELETE, PUT
    //PathVariable /product/{productId}
    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable Integer productId){

        Product product =  productService.getProduct(productId);
        product.setProductName("Produce from path variable");
        return product;

    }

    //RequestParam /product?productId=12
    @GetMapping("/product")
    public Product getProductSample2(@RequestParam Integer productId){

        Product product =  productService.getProduct(productId);
        product.setProductName("Produce from Request param");
        return product;
    }







}
