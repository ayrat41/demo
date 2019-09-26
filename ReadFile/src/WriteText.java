import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws Exception {;
	FileWriter writer = new FileWriter ("C:\\Users\\asadu\\Documents\\PNT\\Documents\\Document.xls");
	
		writer.write("This is Selenium 1");
		writer.write("\r\n");
		writer.write("This is Selenium 2");
		writer.write("\r\n");
		writer.write("This is Selenium 3");
		writer.write("\r\n");
		writer.write("This is Selenium 4");
		writer.write("\r\n");
		writer.write("This is Selenium 5");
		writer.close();
	}

}
