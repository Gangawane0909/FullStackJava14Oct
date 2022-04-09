package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjava","root","Shradha@123");

            CallableStatement callableStatement = connection.prepareCall("call gateData()");
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) ;
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));


        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }


}





