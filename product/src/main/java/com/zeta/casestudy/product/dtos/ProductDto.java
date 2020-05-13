package com.zeta.casestudy.product.dtos;

import java.io.Serializable;

public class ProductDto implements Serializable
{

    private static final long serialVersionUID = 764241442538332781L;
    private Long id;
    private Double rating;
    private String type;
    private String name;
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
     * @return the rating
     */
    public Double getRating()
    {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating( Double rating )
    {
        this.rating = rating;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType( String type )
    {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName( String name )
    {
        this.name = name;
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
            + ( ( id == null ) ? 0
                : id.hashCode() );
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
        ProductDto other = (ProductDto) obj;
        if( id == null )
        {
            if( other.id != null )
                return false;
        }
        else if( !id.equals( other.id ) )
            return false;
        return true;
    }

}
