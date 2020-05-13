package com.zeta.casestudy.product.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zeta.casestudy.product.dtos.ProductDataDto;
import com.zeta.casestudy.product.dtos.ProductDto;
import com.zeta.casestudy.product.dtos.ProductPriceDto;
import com.zeta.casestudy.product.entities.Product;
import com.zeta.casestudy.product.exceptions.ProductNotFoundException;
import com.zeta.casestudy.product.repositories.ProductRepository;

@Service
public class ProductService
{

    @Autowired
    private ProductRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @Value( "${resource.productdata}/{id}" )
    private String productData;

    @Value( "${resource.productPrice}/{id}" )
    private String productPrice;

    public List<ProductDto> all()
    {
        return repository.findAll().stream().map( x -> toDto( x, null, null ) ).collect( Collectors.toList() );
    }

    public ProductDto one( Long id )
    {
        Product product = repository.findById( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
        ProductDataDto dataDto = restTemplate.getForObject( productData, ProductDataDto.class, id );
        ProductPriceDto priceDto = restTemplate.getForObject( productPrice, ProductPriceDto.class, id );
        return toDto( product, dataDto, priceDto );
    }

    public ProductDto save( Product product )
    {
        return toDto( repository.save( product ), null, null );
    }

    public ProductDto update( ProductDto reqDto,
                              Long id )
    {
        Product product = repository.findById( id ).orElseThrow( () -> new ProductNotFoundException( id ) );
        ProductDataDto dataDto = restTemplate.getForObject( productData, ProductDataDto.class, id );
        ProductPriceDto priceDto = restTemplate.postForObject( productPrice, reqDto, ProductPriceDto.class, id );
        return toDto( product, dataDto, priceDto );
    }

    private ProductDto toDto( Product obj,
                              ProductDataDto data,
                              ProductPriceDto price )
    {
        ProductDto dto = new ProductDto();
        dto.setId( obj.getId() );
        dto.setRating( obj.getRating() );
        dto.setType( obj.getType() );
        if( data != null )
        {
            dto.setName( data.getName() );
        }
        if( price != null )
        {
            dto.setPrice( price.getPrice() );
        }
        return dto;
    }
}
