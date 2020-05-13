package com.zeta.casestudy.productprice.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeta.casestudy.productprice.dtos.ProductPriceDto;
import com.zeta.casestudy.productprice.entities.ProductPrice;
import com.zeta.casestudy.productprice.exceptions.ProductNotFoundException;
import com.zeta.casestudy.productprice.repositories.ProductPriceRepository;

@Service
public class ProductPriceService
{

    @Autowired
    private ProductPriceRepository repository;

    public List<ProductPriceDto> all()
    {
        return repository.findAll().stream().map( x -> toDto( x ) ).collect( Collectors.toList() );
    }

    public ProductPriceDto one( Long id )
    {
        return toDto( repository.findByPid( id ).orElseThrow( () -> new ProductNotFoundException( id ) ) );
    }

    public ProductPriceDto update( ProductPriceDto reqDto,
                                   Long id )
    {
        ProductPrice price = repository.findByPid( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
        price.setPrice( reqDto.getPrice() );
        return save( price );
    }

    public ProductPriceDto save( ProductPrice obj )
    {
        return toDto( repository.save( obj ) );
    }

    private ProductPriceDto toDto( ProductPrice obj )
    {
        ProductPriceDto dto = new ProductPriceDto();
        dto.setId( obj.getId() );
        dto.setPid( obj.getPid() );
        dto.setPrice( obj.getPrice() );
        return dto;
    }
}
