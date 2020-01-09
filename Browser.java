import java.util.Scanner;


public class Browser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int input;
        BookmarkList bookmark_list = new BookmarkList();

        while (running) {
            printMenu();
            //printsTheMenu

            input = sc.nextInt();

            if (input == 0){
                running = false;
            }
            else{

                if(input == 1){
                    // Add Bookmark
                    Bookmark new_bookmark = new Bookmark(sc.nextLine(), sc.nextLine());
                    bookmark_list.addBookmark(new_bookmark);
                }

                if(input == 2){
                    //Printout Bookmark
                    bookmark_list.printList();
                }

            }

        }

    }
     public static void printMenu(){
        System.out.println("Menu");
        System.out.println("-------");
        System.out.println("Enter 0 To Stop");
        System.out.println("1 - Add Bookmark");
        System.out.println("2 - Print list of Bookmarks");

    }
}