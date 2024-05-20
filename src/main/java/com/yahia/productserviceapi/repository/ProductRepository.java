package com.yahia.productserviceapi.repository;

import com.yahia.productserviceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //this is a jpa repository
}
