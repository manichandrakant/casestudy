package com.zeta.casestudy.productprice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductPrice implements Serializable
{

    private static final long serialVersionUID = 2549520771376869363L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
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
        ProductPrice other = (ProductPrice) obj;
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
