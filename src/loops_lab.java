
public class loops_lab {

	public static void main(String[] args) {
//		1.  Write a loop that prints 10x
		
//		for(int i = 1; i<11; i++) {
//		System.out.print(i);
//		}
		
//		2. write a loop that iterates by two and write name
//		String str = "Wilburt";
//		for (int i = 1; i<11; i+=2){
//		System.out.println(i);
//		System.out.println();
//		System.out.println(str);
//		}
		
		/*3. write a loop that prints asterisk 15 times
		char asterisk = '*';
		for (int i = 1; i<16; i++) {
			System.out.print(asterisk);
			System.out.println(i);
			
			}*/
		
		
//		4. Write for loop for odd and even nums 1-10
		/*for(int i = 1; i<11; i++) {
			if(i > 1 && i % 2 == 0) {
				System.out.print(i + ", ");
				}
			
		}
		System.out.println();
		
		for(int i = 1; i < 11; i++) {
			if(i >=1 && i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}*/
		
//		5. While loop add up numbers 1-20
//		int sum = 0; 
//		int num1 = 1; 
//		while(num1 <= 20) {
//			sum += num1; 
//			num1++; 
//		}
//		System.out.println(sum);
		
		
		
		/*int num = 0; 
		while(num < 20) { 
			num+=2;
			System.out.println(num);
		}*/
		
//		**Nested Loops
		
		for(int i = 1; i<=5; i++) {
			
			 for(int c = 1; c<=i; c++) {
				 System.out.print(i);
				 
			 }
			 System.out.println();
		}
		
		for(int r = 1; r<=5; r++) {
			
			for(int w = r; w <= 5; w++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
		
		
	
		
		
	}

}
