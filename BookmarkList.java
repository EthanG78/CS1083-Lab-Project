public class BookmarkList {
    private Bookmark[] list;
    private int nBookmarks = 0;

    public BookmarkList ()
    {
        list = new Bookmark[5];
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
        Bookmark[] temp = new Bookmark[list.length * 2];
        for (int i = 0; i < list.length; i++)
        {
            temp[i] = list[i];
        }

        list = temp;
    }
}