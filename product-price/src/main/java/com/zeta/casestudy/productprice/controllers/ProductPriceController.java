package com.zeta.casestudy.productprice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.casestudy.productprice.dtos.ProductPriceDto;
import com.zeta.casestudy.productprice.entities.ProductPrice;
import com.zeta.casestudy.productprice.services.ProductPriceService;

@RestController
public class ProductPriceController
{

    @Autowired
    private ProductPriceService productPriceService;

    @GetMapping( "/productprice" )
    public List<ProductPriceDto> all()
    {
        return productPriceService.all();
    }

    @GetMapping( "/productprice/{pid}" )
    public ProductPriceDto one( @PathVariable Long pid )
    {
        return productPriceService.one( pid );
    }

    @PostMapping( "/productprice/{pid}" )
    public ProductPriceDto update( @RequestBody ProductPriceDto reqDto,
                                   @PathVariable Long pid )
    {
        return productPriceService.update( reqDto, pid );
    }

    @PutMapping( "/productprice" )
    public ProductPriceDto save( @RequestBody ProductPrice productPrice )
    {
        return productPriceService.save( productPrice );
    }
}
