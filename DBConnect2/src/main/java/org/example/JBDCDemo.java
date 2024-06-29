package org.example;
import javax.xml.transform.Result;
import java.sql.*;

public class JBDCDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcDemo?useSSL=false"; //jdbcDemo is the database name
        String username = "root";
        String password = "Edwige_sroot";
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver"); //The Class.forName method is used to dynamically load the MySQL JDBC driver class. Not necessary in newer versions

            Connection connection = DriverManager.getConnection(url, username, password); //establish a connection to DB

            Statement statement = connection.createStatement(); //statement obj executes SQL queries

            ResultSet resultSet = statement.executeQuery("select * from student1");

            System.out.printf("%-5s | %-20s | %-5s | %-20s%n", "ID", "Name", "Age", "City");
            System.out.println("------------------------------------------------------");

            while (resultSet.next()){
                System.out.printf("%-5d | %-20s | %-5d | %-20s%n",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4));
            }

            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

