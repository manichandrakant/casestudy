package com.zeta.casestudy.productprice.dtos;

import java.io.Serializable;

public class ProductPriceDto implements Serializable
{

    private static final long serialVersionUID = -855314761388971997L;
    private Long id;
    private Long pid;
    private Double price;

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( Long id )
    {
        this.id = id;
    }

    /**
     * @return the pid
     */
    public Long getPid()
    {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid( Long pid )
    {
        this.pid = pid;
    }

    /**
     * @return the price
     */
    public Double getPrice()
    {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice( Double price )
    {
        this.price = price;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
            + ( ( pid == null ) ? 0
                : pid.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj )
    {
        if( this == obj )
            return true;
        if( obj == null )
            return false;
        if( getClass() != obj.getClass() )
            return false;
        ProductPriceDto other = (ProductPriceDto) obj;
        if( pid == null )
        {
            if( other.pid != null )
                return false;
        }
        else if( !pid.equals( other.pid ) )
            return false;
        return true;
    }

}
