package com.company;

public class Bookmark
{
    String ID;
    String WebAddress;
    public Bookmark( String ID, String WebAddress)
    {
        this.ID = ID;
        this.WebAddress = WebAddress;

    }

    public String toString()
    {
        return ID + ": " + WebAddress;
    }


}
