package loops;
import java.util.Scanner;
public class loopss {
	public static void main(String args[]) {
		
		// loops are used in situations that require repetition
					Scanner scanner=new Scanner(System.in);
				
						
					
					//for loop	
					/*
					
					 for(initialization; condition; increment or decrement operations){
					 
					  //this will work as long as our loop condition is true
					 
					 }
					 */
					//capacity control
					/*
					int capacity=100;
					for(int i=0;i<=capacity;i++) {
						if(i<100) {
							System.out.println("capacity is being increased...");
						}
						else {
							System.out.println("full capacity..........");
						}
					}
					*/
					//while loop
					/*   
					 //Beginning       
					 while(loop condition){
					 //works as long as the condition is true
					 //increase or decrease operations are performed
					 }
					  */
					/*
					int Amount;
					int pull;
					int Balance=0;
					String Message="Press =4 for 1=balance learning\n2=deposit\n3=withdraw\nexit...";
					System.out.println(Message);
					while(true) {
						int Number=scanner.nextInt();
						if(Number==1) {
							System.out.println("your balance="+Balance);
							System.out.println(Message);
						}
						else if(Number==2) {
							System.out.println("Enter the amount you want to deposit:");
							Amount=scanner.nextInt();
							Balance=Balance+Amount;
							System.out.println("your new balance="+Balance);
							System.out.println(Message);

						}
						else if(Number==3) {
							System.out.println("Select the amount you want to withdraw:");
							pull=scanner.nextInt();
							Balance=Balance-pull;
							if(Balance<0) {
								Balance=Balance+pull;
								System.out.println("sorry, the amount you want to withdraw is not available in your bank, your balance="+Balance);
								System.out.println(Message);
								
							}
							else {
								System.out.println("the amount you requested has been withdrawn from your new balance:"+Balance);
								System.out.println(Message);
							}
						}
						else if(Number==4) {
							System.out.println("Exit is being made...");
							break;
						}
						else {
							System.out.println("Try again using the 1,2,3,or q keys");
							System.out.println(Message);
						}
					}
					*/
					//do while
					/*
					 //Beginning
					  do{
					  //works at least 1 time whether the condition is true or not
					  //increase and decrease operations
					  
					  }while(loop condition);
					 */
					//menu display
					/*
					int i=0;
					int menu;
					do {
						System.out.println("menu:\n1 for soups\n2 for drinks\n3 for desserts\nout =4");
						menu=scanner.nextInt();
						if(menu==1) {
							System.out.println("Soups:---");
						}
						else if(menu==2) {
							System.out.println("Drinks:---");
						}
						else if(menu==3){
							System.out.println("sweets:---");
						}
						else if(menu==4) {
							System.out.println("Exit is being made...");
							break;
						}
						else {
							System.out.println("click on one of the buttons indicated...");
						}
					}while(true);
					*/
					
					//break and continue constructs
					
					//break Ends the loop completely.
					
					/*for (int i = 0; i < 10; i++) {
			    if (i == 5) {
			        break; // Exit the loop when i is 5
			    }
			    System.out.println(i);
			}
			     //This code fragment prints the numbers from 0 to 4 and terminates the loop when i is 5.
			*/
					//continue: Skips the current iteration of the loop and moves to the next iteration.
					
					/*
					 for (int i = 0; i < 10; i++) {
			    if (i % 2 == 0) {
			        continue; // If i is even, skip this iteration of the loop
			    }
			    System.out.println(i);
			}
			This code fragment prints only odd numbers (1, 3, 5, 7, 9) because when i is even, continue is used to skip that iteration.
			*/
				//nested for
				/*for(initialization; condition; increment or decrement operations){
				       here are the things to do
				 for(initialization; condition; increment or decrement operations){
				 here are the things to do//(we can loop into it as many times as we want if we need another loop)
				 } 
				 }*/
					/*
				for(int i=1;i<=10;i++){
					for(int j=1;j<=10;j++) {
						System.out.println(i+" "+j+" "+"="+i*j);
					}
				}
				*/
					//Making a star with nested beads
					/*
					 for(int i=1;i<=10;i++) {
						for(int j=1;j<=i;j++) {
							System.out.print("* ");
						}
						System.out.println();
					}
					*/
					/*
					for(int i=10;i>=1;i--) {
						for(int j=1;j<=i;j++) {
							System.out.print("* ");
						}
						System.out.println();
					}
					*/

					
			
			
		
		
	}
}
