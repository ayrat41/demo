package abstarctVsInterface;

public interface InterfaceSample2 {
	int zip = 22041;
 public void name(String name);
 default void lastName(String lastName) {
	 System.out.println("InterfaceSample2");
	 System.out.println(lastName);
 };
 public void age(int age);
}