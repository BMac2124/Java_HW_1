package conditionals;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

//		int grade = 44;
////		student grade 90 or higher "A"
//		if(grade >= 90 && grade <=100) {
//			System.out.println("You have an A");
//		}
//		//Student grade 80 less than 90 is a B
//		else if (grade >= 80 && grade < 90) {
//			System.out.println("You have a B");
//		}
//		//Student grade 70 and less than 80 is C
//		else if (grade >= 70 && grade < 80) {
//			System.out.println("You have a C");
//		}
//		//Student grade 55 and less than 70 is D
//		else if (grade >= 55 && grade < 70) {
//			System.out.println("You have a D");
//		}
//		//Student grade lower than 55 is F
//		else {
//			System.out.println("You have a F");
//		}
//	



//2. 
		//Using Switch case
//		int day = 8; 
//		switch (day) {
//		
//		case 1: 
//			System.out.println("Sunday");
//			break; 
//		case 2:
//			System.out.println("Monday");
//			break; 
//		case 3: 
//			System.out.println("Tuesday");
//			break; 
//		case 4: 
//			System.out.println("Wednesday");
//			break; 
//		case 5: 
//			System.out.println("Thursday");
//			break;
//		case 6: 
//			System.out.println("Friday");
//			break; 
//		case 7: 
//			System.out.println("Saturday");
//			break; 
//		default: 
//			System.out.println("That ain't Right!");
//		
//		}
		
		
//		3. Variable num odd/even
		
		int num = 6;
		
		if(num % 2 == 1) {
			System.out.println("Cool!");
		}
		else if (num % 2 ==0 && num >=2 && num < 5) {
			System.out.println("Not Cool!");
		}
		else if (num % 2 ==0 && num >=6 && num < 20) {
			System.out.println("Cool!");
		}
		
		else {
			System.out.println("Not Cool Bro!");
		}
	}
}
