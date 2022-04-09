package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstackjava","root","Shradha@123");
                String insert="insert into employee1(id,name,address) values(?,?,?)";
                PreparedStatement preparedStatement=connection.prepareStatement(insert);
                for (int i=1;i<5;i++)
                {
                    preparedStatement.setInt(1,i);
                    preparedStatement.setString(2,"name=>"+i);
                    preparedStatement.setString(3,"address"+i);
                    preparedStatement.addBatch();
                }
                int[] j=preparedStatement.executeBatch();
                System.out.println("record inserted"+j.length);

                String select = "select* from employee1";
                Statement statement = connection.createStatement();

                ResultSet rs = statement.executeQuery(select);

                ResultSetMetaData rsm = rs.getMetaData();
                System.out.println(rsm.getColumnName(1) + " " + rsm.getColumnName(2) + " " + rsm.getColumnName(3));
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
                }


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


