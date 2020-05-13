package com.zeta.casestudy.product.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable
{

    private static final long serialVersionUID = 6352353978106955740L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    /**
     * rating, The rating of the product on a scale of 1 to 5
     */
    private Double rating;

    /**
     * type, The type of the product whether Electronics/Books/Sports/Furniture
     */
    private String type;

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
        Product other = (Product) obj;
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