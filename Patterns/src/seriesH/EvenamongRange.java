package seriesH;

import java.util.Scanner;

public class EvenamongRange {

	public static void main(String[] args) {
		System.out.println("Enter the starting No : ");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the starting No : ");
		int b = sc.nextInt();
		while(a<=b){
			if(a%2==0)
				System.out.println(a+" ");
			a++;
		}
sc.close();
	}

}
