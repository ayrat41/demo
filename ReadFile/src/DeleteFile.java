import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File ("C:\\Users\\asadu\\Documents\\PNT\\Documents\\Document.txt");
		file.delete();
		if (file.delete()) {
			System.out.println("Fife is deleted succesfully.");
		} else {
            System.out.println("File is not deleted.");
		}
		
	}

}
