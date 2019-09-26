package abstarctVsInterface;

public interface InterfaceSample1 {
	int zip = 22041;
 public void name(String name);
 default void lastName(String lastName) {
	 System.out.println("InterfaceSample1");
 };
 public void age(int age);
}
