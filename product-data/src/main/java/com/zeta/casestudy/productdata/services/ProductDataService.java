package com.zeta.casestudy.productdata.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeta.casestudy.productdata.dtos.ProductDataDto;
import com.zeta.casestudy.productdata.entities.ProductData;
import com.zeta.casestudy.productdata.exceptions.ProductNotFoundException;
import com.zeta.casestudy.productdata.repositories.ProductDataRepository;

@Service
public class ProductDataService
{

    @Autowired
    private ProductDataRepository repository;

    public List<ProductDataDto> all()
    {
        return repository.findAll().stream().map( x -> toDto( x ) ).collect( Collectors.toList() );
    }

    public ProductDataDto one( Long pid )
    {
        return toDto( repository.findByPid( pid ).orElseThrow( () -> new ProductNotFoundException( pid ) ) );
    }

    public ProductDataDto save( ProductData obj )
    {
        return toDto( repository.save( obj ) );
    }

    /*
    public String findProductName( Long pid )
    {
        ProductData data = repository.findByPid( pid ).orElseThrow( () -> new ProductNotFoundException( pid ) );
        return data.getName();
    }
    */

    private ProductDataDto toDto( ProductData obj )
    {
        ProductDataDto dto = new ProductDataDto();
        dto.setId( obj.getId() );
        dto.setPid( obj.getPid() );
        dto.setName( obj.getName() );
        return dto;
    }
}
