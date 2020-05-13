package com.zeta.casestudy.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.casestudy.product.dtos.ProductDto;
import com.zeta.casestudy.product.entities.Product;
import com.zeta.casestudy.product.services.ProductService;

@RestController
public class ProductController
{

    @Autowired
    private ProductService productService;

    @GetMapping( "/products" )
    public List<ProductDto> getAllProducts()
    {
        return productService.all();
    }

    @GetMapping( "/products/{id}" )
    public ProductDto one( @PathVariable Long id )
    {
        return productService.one( id );
    }

    @PostMapping( "/products/{id}" )
    public ProductDto update( @RequestBody ProductDto dto,
                              @PathVariable Long id )
    {
        return productService.update( dto, id );
    }

    @PutMapping( "/products" )
    public ProductDto save( @RequestBody Product product )
    {
        return productService.save( product );
    }
}
