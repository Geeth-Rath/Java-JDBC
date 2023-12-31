package org.example;
import java.sql.*;


public class Dbc {

    public static void main(String arg[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Tree");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        }
         catch (Exception e) {
           e.printStackTrace();
        }


    }

}
