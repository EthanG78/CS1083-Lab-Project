public class Bookmark
{
    //Creating ID and WebAddress as Strings
    String ID;
    String WebAddress;

    //Creating a Constructor that recieves ID and WebAddress in it's parameter
    public Bookmark( String ID, String WebAddress)
    {
        this.ID = ID;
        this.WebAddress = WebAddress;

    }


    //Creating a toString method that prints the bookmark list
    public String toString()
    {
        if(ID.equals(" ") || WebAddress.equals(" "))
        {
            return "";
        }
        else
        {
            return ID + ": " + WebAddress;
        }

    }


}
