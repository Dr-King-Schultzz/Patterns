package seriesH;

import java.util.Scanner;

public class EvenAmongFor {
	public static void main(String[] args) {
		System.out.println("Enter the starting No : ");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the starting No : ");
		int b = sc.nextInt();
		System.out.println("Even Nos are: ");
		for(int i=a;i<=b;i++){
			if(a%2==0)
				System.out.print(a+" ");
			a++;
		}
sc.close();
	}

}
