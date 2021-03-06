//======================================
//  Kyle Russell
//  AUT University 2016
//  Highly Secured Systems A2
//======================================

package com.kyleruss.cryptocommons;

import java.io.Serializable;

public abstract class SafeStructure implements Serializable
{
    protected byte[] data;
    
    public SafeStructure(int length)
    {
        data    =   new byte[length];
    }
    
    protected void generateRandomData(int length)
    {
        data    =   CryptoUtils.generateRandomBytes(length);
    }
    
    public int getDataSize()
    {
        return data.length;
    }
    
    public byte[] getData()
    {
        return data;
    }
    
    public void setData(byte[] data)
    {
        this.data   =   data;
    }
}
