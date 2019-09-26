import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {

	public static void main(String[] args) throws Exception {
		Path temp = Files.move(Paths.get("C:\\Users\\asadu\\Documents\\PNT\\Documents\\Document.txt"), Paths.get("C:\\Users\\asadu\\Documents\\PNT\\Document.txt"));
		
		if (temp != null) {
		System.out.println("GOOD");	
		}
		
	}
}