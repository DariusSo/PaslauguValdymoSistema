package org.example;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/pirmaDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException, IOException {
        DatabaseManager db = new DatabaseManager(URL, USERNAME, PASSWORD);
        db.menu();

    }
}