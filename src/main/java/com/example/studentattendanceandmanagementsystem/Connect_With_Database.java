package com.example.studentattendanceandmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_With_Database {
    private static final String URL = "jdbc:mysql://localhost:3306/student_attendance_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Satish@2000";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
