package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        ArrayList<Book> bookArray = new ArrayList<>();
        Book b1 = new Book("harry potter", "rolling", "fantasy", 10, true);
        Book b2 = new Book("Head first java", "bert Bates", "workbook", 47, true);
        bookArray.add(b1);
        bookArray.add(b2);
        for (Book b : bookArray) {
            System.out.println("Author : " + b.getAuthor() + ", Title : " + b.getTitle() + ", Description : " + b.getDescription());
        }
        getOrder(bookArray);
    }

    public static void getOrder(ArrayList<Book> bookArray) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a book title to order : ");
        String orderTitle = keyboard.nextLine();

        //int index = Collections.binarySearch(bookArray.getTitle(), orderTitle);
        for (Book b : bookArray) {
            if (b.getTitle().equals(orderTitle)) {
                System.out.println("book found.");
                if (b.isInStock()) {
                    System.out.println("How many?");
                    int orderNumber = keyboard.nextInt();
                    int price = orderNumber * b.getPrice();
                    System.out.println("$" + price);
                } else {
                    System.out.println("Book not found.bye");
                }

            }
        }
    }
}
