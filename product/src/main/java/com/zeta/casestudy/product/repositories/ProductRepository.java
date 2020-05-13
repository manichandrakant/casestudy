package com.zeta.casestudy.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeta.casestudy.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
