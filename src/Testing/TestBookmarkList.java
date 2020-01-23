/**
 * BookmarkList.java
 * Authors: Ethan Garnier, Albert Stanica & Abdoalah Aboelneil
 * This file is for testing new code before committing to main file.
 *
 * 15/01/20 Made BookmarkList use an ArrayList<> - Ethan
 */
package Testing;
import java.util.ArrayList;

public class TestBookmarkList
{
    private ArrayList<TestBookmark> list;

    public TestBookmarkList()
    {
        list = new ArrayList<>();
    }

    //Adds a bookmark to list using .add method
    public void addBookmark(TestBookmark bookmark)
    {
        list.add(bookmark);
    }

    public void printList()
    {
        for (int i = 0; i < list.size(); i++)
        {
            /*//If the object is not null (bookmark exists), print the bookmark
            if (list.get(i) != null)
            {
                System.out.println("\t" + list.get(i));
            }*/
            System.out.println("\t" + list.get(i));
        }
        System.out.println();
    }
}
