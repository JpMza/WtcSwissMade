package com.wtc.swissmade.swm.repositories;

import com.wtc.swissmade.swm.models.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

  //  List<Product> findById();

   // List<Product> findByActive(Boolean type);

    Optional<Product> findByName(String name);

    @Query("select c from product c where c.name like %:name%")
    Page<Product> fullTextSearchAll(@Param("name") String name, Pageable pageable);
}
