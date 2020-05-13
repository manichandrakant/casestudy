package com.zeta.casestudy.productprice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeta.casestudy.productprice.entities.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Long>
{
    Optional<ProductPrice> findByPid( Long pid );
}
