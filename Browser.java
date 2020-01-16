/**
 * Browser.java
 * Authors: Ethan Garnier, Albert Stanica & Abdoalah Aboelneil
 * This file is for testing new code before committing to main file.
 */
import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        boolean running = true;
        int input;

        Scanner sc = new Scanner(System.in);

        BookmarkList bookmark_list = new BookmarkList();

        System.out.println("~~~~~~~THIS IS A TEST PROGRAM~~~~~~~");

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

                if(input == 3){
                    // Launces the Website
                    System.out.print("Which bookmark do you want to display? ");

                    int bookMarkIndex = sc.nextInt();
                    String webAddress = bookmark_list.getBookmark(bookMarkIndex).getWebAddress();
                    String ID = bookmark_list.getBookmark(bookMarkIndex).getID();
                    System.out.println("Displaying " + ID + "...");
                    if (webAddress.substring(webAddress.length() - 4, webAddress.length()).equals(".pdf")){
                        System.out.print("Im A PDF");

                    }
                    else{
                        System.out.println("I am a website");

                    }


                    /*try {


                    }
                    catch (Exception e){
                        System.out.println("It didn't work");

                    }*/
                }

            }

        }

    }

    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("-------");
        System.out.println("\t1 - Add Bookmark");
        System.out.println("\t2 - Print list of Bookmarks");
        System.out.println("\t3 - Display a Bookmark");
        System.out.print("Your choice? (0 to quit) ");
    }
}