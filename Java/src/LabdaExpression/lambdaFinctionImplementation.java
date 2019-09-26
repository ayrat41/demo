package LabdaExpression;

public class lambdaFinctionImplementation{

	public static void main(String[] args) {
		MyFunction myFunction = (String, String1) -> System.out.println("Lambda method ==>");
			myFunction.apply("Hello World!", "I did it");
	}

}
