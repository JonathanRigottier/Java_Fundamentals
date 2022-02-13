package grocery;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();

        while(!quit){
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            //Fix
            scanner.nextLine();

            switch (choice){
                case 0:
                    //print all option
                    printInstruction();
                break;
                case 1:
                    //print grocery list
                    groceryList.printGroceryList();
                    break;
                case 2:
                    //add item
                    addItem();
                    break;
                case 3:
                    //modify item
                    modifyItem();
                    break;
                case 4:
                    //remove item
                    removeItem();
                    break;
                case 5:
                    //search item
                    searchForItem();
                    break;
                case 6:
                    //quit
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a choice in the range between 0 to 6");
                    break;
            }

        }

    }

    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quite the application");
    }

    public static void addItem(){
        System.out.println("Please enter item you want to add to the grocery list :");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void removeItem(){
        System.out.println("Enter item name that you want to delete");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number that you want to modify");
        int itemNo = scanner.nextInt();
        //Fix
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void searchForItem(){
        System.out.println("Item to search for : ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found : " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not on the shopping list");
        }
    }



}
