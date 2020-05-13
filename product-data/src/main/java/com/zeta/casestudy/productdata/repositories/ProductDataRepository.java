package com.zeta.casestudy.productdata.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeta.casestudy.productdata.entities.ProductData;

public interface ProductDataRepository extends JpaRepository<ProductData, Long>
{

    Optional<ProductData> findByPid( Long pid );
}
