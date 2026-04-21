package out.src;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        try{
            final String URL="jdbc:mysql://localhost:3306/mydb";
            final String Username="root";
            final String Password="root";
            Connection connection=DriverManager.getConnection(URL,Username,Password); 
            System.out.println("Connection established successfully!");
            connection.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
