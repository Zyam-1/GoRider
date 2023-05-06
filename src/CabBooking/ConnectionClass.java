package CabBooking;

import java.sql.*;

public class ConnectionClass {

    Connection con; // Connection class variable con
    Statement stm; // Statment Class Variable Stm

    ConnectionClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabdb", "root", "");
            stm = con.createStatement(); //This is used for Query buidling
        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch contains a Exception Class Variable
    } // ConnectionClass Constructer

    public static void main(String[] args) {
        new ConnectionClass();
    }
}
