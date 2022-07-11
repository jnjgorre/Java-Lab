
public class Main {

	public static void main(String[] args) {
		
		int availablePlaneSeats = 5;
		
		
		
		double costOfGroceries = 23.64;
		
		
		
		char middleInitial = 'N';

		
		
		boolean isHotOutside = true;
		
		
		String customerFirstName = "Sam";
		
		
		String streetAddress = "1234 N Marvel St";
		
		
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the total price for groceries");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customers first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives");
		
		
		//availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2; 
		System.out.println(availablePlaneSeats);
		
		
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		
		middleInitial = 'G';
		System.out.println(middleInitial);
		
		isHotOutside = false;
		//isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		
		String fullName = customerFirstName + " " + middleInitial + " Smith";
		System.out.println(fullName);
		
		
		System.out.println("Hello there, my name is " + fullName + " and I live at " + streetAddress + ".");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 

	
		
		
		

	}

}
