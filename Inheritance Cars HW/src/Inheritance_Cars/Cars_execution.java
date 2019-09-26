package Inheritance_Cars;

public class Cars_execution extends Car_class {

	public static void main(String[] args) {
		Cars_execution ex1 = new Cars_execution();
		ex1.carCondition("New");
		String newMake = ex1.carMake("Ford");
		String newClass = ex1.carClass("SUV");

		if (newMake == "Ford" && newClass == "Sedan") {
			ex1.Model1();
		} else if (newMake == "Ford" && newClass == "SUV") {
			ex1.Model2();
		} else if (newMake == "Ford" && newClass == "Wagon") {
			ex1.Model3();
		} else {
			System.out.println("We dont know the model");

		}
	}
}
//		int newPrice=15000;
//		
//		do {System.out.println("Price is increasing every second" + newPrice +" $");
//		   newPrice ++;		  
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}		   
//		} while (newPrice <= 15010);
//		int x = 0;
//		for (int weight = 5000; weight < 6000; weight = weight + 200) {			
//			System.out.println("Weght with " + x + " passangiers is" + weight);
//			x=x+1;
//		}		
//	}
