package seriesH;

import java.util.Scanner;

public class Range_NoDivisibleBy3and5 {
	public static void main(String[] args) {
		
	
	System.out.println("Enter the starting No : ");
	Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Enter the starting No : ");
	int b = sc.nextInt();
	System.out.println("Displaying No divisible by 3 and 5 are: ");
	for(int i=a;i<=b;i++){
		if(a%5==0 && a%3==0)			// using or ->||
			System.out.print(a+" ");
		a++;
	}
sc.close();
}
}
