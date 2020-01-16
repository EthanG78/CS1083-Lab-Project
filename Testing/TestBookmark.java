/**
 * TestBookmark.java
 * Authors: Ethan Garnier, Albert Stanica & Abdoalah Aboelneil
 * This file is for testing new code before committing to main file.
 */
package Testing;

public class TestBookmark
        {
    //Creating ID and WebAddress as Strings
    String ID;
    String WebAddress;

    //Creating a Constructor that receives ID and WebAddress in it's parameter
    public TestBookmark( String ID, String WebAddress)
    {
        this.ID = ID;
        this.WebAddress = WebAddress;

    }

    //Creating a toString method that prints the bookmark list
    public String toString()
    {
        return ID + ": " + WebAddress;
    }
}

