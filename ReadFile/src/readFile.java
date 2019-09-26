import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class readFile {

	public static void main(String[] args) {
		try {
			File file = new File ("C:\\Users\\asadu\\Documents\\PNT\\Documents\\Document.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String St;
			while ((St=bf.readLine()) != null) {
				System.out.println(St);
			}	
		} catch (Exception e) {
			System.out.println("Inside exception");
			e.printStackTrace();;
		};
	}
}
