package practiceWithJava;

import java.util.Scanner;

public class FunctionsPractice {
 
	int i;
	int j;
	
static	void min(int a, int b) {
		
		if(a>b)
			
			System.out.println(+a + "is max");
		else 
			System.out.println(+b + "is max");
		
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int c = sc.nextInt();
		int d = sc.nextInt();
		min(c, d);
		
		
	}	
			
				}
		


