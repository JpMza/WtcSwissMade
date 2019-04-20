package com.wtc.swissmade.swm.repositories;

import com.wtc.swissmade.swm.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    List<Product> findAll();

    List <Product> findById(Long id);
}
