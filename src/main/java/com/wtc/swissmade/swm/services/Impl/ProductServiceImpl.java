package com.wtc.swissmade.swm.services.Impl;

import com.wtc.swissmade.swm.models.Product;
import com.wtc.swissmade.swm.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl extends ServiceImpl<Product, Long> {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        super(productRepository);
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product entity) {
        super.create(entity);
        return entity;
    }

    @Override
    public void remove(Product entity) {
        super.remove(entity);
    }

    @Override
    public void update(Product entity) {
        super.update(entity);
    }

    /*@Override
    public Product findById(Long id) {
        return super.findById(id);
    }*/

    public Optional<Product> findProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return super.findAll();
    }

    public Page<Product> findAllProductsByQueryName(String queryName, Pageable pageable) {
        return productRepository.fullTextSearchAll(queryName, pageable);

    }

}
