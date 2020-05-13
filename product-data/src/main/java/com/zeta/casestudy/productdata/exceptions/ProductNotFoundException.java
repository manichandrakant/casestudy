package com.zeta.casestudy.productdata.exceptions;

public class ProductNotFoundException extends RuntimeException
{
    private static final long serialVersionUID = 7596518565938968534L;

    public ProductNotFoundException( Long id )
    {
        super( "Cannot find Product with id " + id );
    }
}
