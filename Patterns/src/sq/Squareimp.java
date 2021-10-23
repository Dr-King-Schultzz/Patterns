package sq;

import java.util.Scanner;

public class Squareimp {

	public static void main(String[] args) {

		System.out.println("Enter row no");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=0;i<=row;i++){

			for(int j=0;j<=row;j++){		//j<=i for triangle

				System.out.print(" ");
			}
			for(int j=i; j<=row;j++){
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}
