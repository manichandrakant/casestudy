package com.zeta.casestudy.productdata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeta.casestudy.productdata.dtos.ProductDataDto;
import com.zeta.casestudy.productdata.entities.ProductData;
import com.zeta.casestudy.productdata.services.ProductDataService;

@RestController
public class ProductDataController
{

    @Autowired
    private ProductDataService productDataService;

    @GetMapping( "/productdata" )
    public List<ProductDataDto> all()
    {
        return productDataService.all();
    }

    @GetMapping( "/productdata/{pid}" )
    public ProductDataDto one( @PathVariable Long pid )
    {
        return productDataService.one( pid );
    }

    /*
    @GetMapping( "/productname/{pid}" )
    public String findProductName( @PathVariable Long pid )
    {
        return productDataService.findProductName( pid );
    }
    */

    @PutMapping( "/productdata" )
    public ProductDataDto save( @RequestBody ProductData productData )
    {
        return productDataService.save( productData );
    }
}
