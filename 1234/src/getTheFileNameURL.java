import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;

public class getTheFileNameURL {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL ("http://www.example.com/some/path/to/a/file.xml?date=20-10-20");
//		System.out.println(url.getFile());
//		String stringURL = url.getPath();
//		String[] splitURL = stringURL.split("/");
//		for (int i = 0; i < splitURL.length; i++) {
//			System.out.println(splitURL[splitURL.length]);
//		}
		System.out.println(FilenameUtils.getBaseName(url.getPath()));
		System.out.println(FilenameUtils.getExtension(url.getFile()));
		System.out.println(FilenameUtils.getName(url.getPath()));
	}

}
