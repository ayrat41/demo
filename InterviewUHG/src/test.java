
public class test {
	
static String nameString = "Airat";

	public void main(String[] args) {
	test obj = new test();
	int nameLength = obj.stringLength();
//	System.out.println(nameLength);
	obj.palindrome("maam");
	
	}
	
	public int stringLength() {
		int lenght = nameString.length();
		return lenght;
	}
	public void palindrome(String word) {
		StringBuffer sBuffer = new StringBuffer(word);
		StringBuffer opposeString = sBuffer.reverse();

		if (opposeString.toString().equalsIgnoreCase(word.toString())) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
		
		String word1 = "";
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.println(word.charAt(i));
			word1= word1 + word.charAt(i);
		}
		System.out.println(word + " == "+ word1);
		
		if (word.equalsIgnoreCase(word1)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
	}

}
