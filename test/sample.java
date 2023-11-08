package test;
import java .util.*;


public class sample {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Mutiply");
			System.out.println("4 for ToFind Odd Or Even");
			int givenNumber=sc.nextInt();
			do {
				if(givenNumber==1) {
					System.out.println("Provide Two Numbers to Perform Addition");
					int a=sc.nextInt();
					int b=sc.nextInt();
					System.out.println(a+b);
					givenNumber=sc.nextInt();
					continue;
				}
				else if(givenNumber==2) {
					System.out.println("Provide Two Numbers to Perform Subtraction");
					int a=sc.nextInt();
					int b=sc.nextInt();
					System.out.println(a-b);
					givenNumber=sc.nextInt();
					continue;
				}
				else if(givenNumber==3) {
					System.out.println("Provide Two Numbers to Perform Multiplication");
					int a=sc.nextInt();
					int b=sc.nextInt();
					System.out.println(a*b);
					givenNumber=sc.nextInt();
				    continue;
				}
				else if(givenNumber==4) {
					System.out.println("Provide One Number to Find Odd or Even");
					int a=sc.nextInt();
					if(a%2==0) {
						System.out.println("Given Number is Even");
						
					}
					else {
						System.out.println("Given Number id Odd");
					}
					givenNumber=sc.nextInt();
					continue;
				}
				else if(givenNumber==5) {
					System.out.println("Terminating Operation....");
					break;
					
				}
				else {
					
					System.out.println("Please provide 1 to 4 And 5 Terminate the operation");
					System.out.println("Give an option to perform operation");
					givenNumber=sc.nextInt();
					continue;
				}
				
			}while(true);
			sc.close();
		}
	}


