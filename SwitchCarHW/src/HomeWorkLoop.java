
public class HomeWorkLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String myCar = "Elantra";
	
	if (myCar=="Accent") {
		System.out.println("True my car is " + myCar);
	} else if (myCar=="Accent") {
		System.out.println("True my car is " + myCar);
	} else if (myCar=="Santa Fe") {
		System.out.println("True my car is " + myCar);
	} else if (myCar=="Sonata") {
		System.out.println("True my car is " + myCar);
	} else if (myCar=="Kona") {
		System.out.println("True my car is " + myCar);
	} else if (myCar=="Pasadena") {
		System.out.println("True my car is " + myCar);
	} else {
		System.out.println("False my car is " + myCar);
	}

	switch (myCar) {
	       case "Accent":
	    	   System.out.println("True my car is " + myCar);
		break;
	       case "Elantra":
	    	   System.out.println("True my car is " + myCar);	
		break;
	       case "Santa Fe":
	    	   System.out.println("True my car is " + myCar);
			break;
	       case "Pasadena":
	    	   System.out.println("True my car is " + myCar);
	   		break;
	       case "Sonata":
	    	   System.out.println("True my car is " + myCar);	    		
	   		break;
	default:
		break;
		
	}	//if else if loop
		
	for (int x = 1; x <= 10; x++) {
			System.out.println("The number is" + x);
	        if (x==5) {
			System.out.println("Congrats your number is " + x);	
			}  //for loop      
	}
    int y=1;
     
    while (y <= 10) {
    	System.out.println("Here is the current number " + y);
    	y++;
    	if (y == 9) {
		    System.out.println("Almost done");
		}
    }
    
    int z=1;
    
	do {
		System.out.println("the number is only " + z + "keep trying");
	      z++;
	} while (z<10);
	

	}
}