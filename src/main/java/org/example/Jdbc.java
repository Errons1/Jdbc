package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Jdbc {
    private final Connection connection;

    public Jdbc() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/database.properties"));
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        connection = DriverManager.getConnection(url, username, password);
    }
    
    public void saveBook(Book book) throws SQLException {
        String sql = """
                INSERT INTO books(title, pages)
                VALUES (?, ?);
                """;

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getPages());
        preparedStatement.executeUpdate();
    }
    
    public Book getBookByTile(String title) throws SQLException {
        String sql = """
                SELECT title, pages
                FROM books
                WHERE title = ?;
                """;
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (!resultSet.next()) {
            return null;
        }
        
        String resultTitle = resultSet.getString(1);
        int resultPages = resultSet.getInt(2);
        return new Book(resultTitle, resultPages);
    }
    
}
