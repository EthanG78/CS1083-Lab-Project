public class BookmarkList {
    private Bookmark[] list;
    private int nBookmarks = 0;

    public BookmarkList ()
    {
        list = new Bookmark[1];
        list[0] = new Bookmark(" "," ");
    }

    public void addBookmark(Bookmark bookmark)
    {
        if (nBookmarks == list.length)
        {
            increaseSize();
        }

        list[nBookmarks] = bookmark;
        nBookmarks++;
    }

    private void increaseSize()
    {
        Bookmark[] temp = new Bookmark[list.length + 1];
        for (int i = 0; i < list.length; i++)
        {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void printList()
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("\t" + list[i]);
        }
        System.out.println();
    }
}