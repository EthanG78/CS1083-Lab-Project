/**
 * Browser.java
 * Authors: Ethan Garnier, Albert Stanica & Abdoalah Aboelneil
 */
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
                    System.out.print("ID for the bookmark: ");
                    String ID = sc.next();

                    System.out.print("Web address or file name: ");
                    String url = sc.next();

                    Bookmark new_bookmark = new Bookmark(ID, url);
                    bookmark_list.addBookmark(new_bookmark);
                }

                if(input == 2){
                    //Printout Bookmark
                    System.out.println("Bookmark list: ");
                    bookmark_list.printList();
                }

            }

        }

    }

    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("-------");
        System.out.println("\t1 - Add Bookmark");
        System.out.println("\t2 - Print list of Bookmarks");
        System.out.print("Your choice? (0 to quit) ");
    }
}