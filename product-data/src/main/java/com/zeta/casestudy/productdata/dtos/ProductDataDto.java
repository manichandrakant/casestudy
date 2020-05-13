package com.zeta.casestudy.productdata.dtos;

import java.io.Serializable;

public class ProductDataDto implements Serializable
{

    private static final long serialVersionUID = -5760902514939439978L;
    private Long id;
    private Long pid;
    private String name;

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
        ProductDataDto other = (ProductDataDto) obj;
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
