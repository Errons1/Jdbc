package org.example;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Jdbc jdbc = new Jdbc();
        Book sendBook = new Book("How to learn Java", 19);
        jdbc.saveBook(sendBook);
        
        Book getBook = jdbc.getBookByTile(sendBook.getTitle());
        System.out.println(getBook);
    }
}