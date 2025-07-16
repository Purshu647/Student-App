package in.pentagon.studentapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//connector factory class
public class Connector {
public static Connection requestConnection() {
Connection con=null;
String url="jdbc:mysql://localhost:3306/college";
String user="root";
String password="tiger";
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection(url, user, password);
}
catch (ClassNotFoundException | SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return con;
}
}
