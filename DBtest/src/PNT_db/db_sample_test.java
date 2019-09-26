package PNT_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db_sample_test {
 static Connection con =null;
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@win-enfsla0s80s:1521:xe","hr","hr");
			  Statement stmt = con.createStatement();  
			  ResultSet query = stmt.executeQuery("Select * from employee");
			  int count=0;
	            while (query.next()) {
	                count+=1;
	                String productNumber = query.getString("First_name");
	                String productName = query.getString("Last_name");
	                String productPrice = query.getString("price");
	                System.out.println("Row #:"+count);
	                System.out.println("Product#: "+productNumber);
	                System.out.println("Product Name: "+productName);
	                System.out.println("Price: "+productPrice);

	                }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 if (con != null) {
		            System.out.println("You made it, take control your database now!");
		        } else {
		            System.out.println("Failed to make connection!");
		        }
		}
	}

}
