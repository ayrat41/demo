package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.ResultSet;

import oracle.sql.converter.JdbcCharacterConverters;

public class TestMySQLAirat {
	@Test
	public void testDB () throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airat_test", "root", "Lubimaya77!");
		System.out.println("Connected to MySQL DB");
		java.sql.Statement statement = connection.createStatement();
		java.sql.ResultSet rSet = statement.executeQuery("select * from seleniumuser;");
		while (rSet.next()) {
			String firstName = rSet.getString("firstname");
			System.out.println("First name==>"+ firstName);
			String emailName = rSet.getString("email");
			System.out.println("Email==>"+ emailName);
		}
		
	}
}
