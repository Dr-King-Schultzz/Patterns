package pattern1triangle;

import java.util.Scanner;

public class Symbols {

	public static void main(String[] args) {

		System.out.println("Enter row no");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){			//j<=row for square

				if (j%2==0)
					System.out.print("@"+" ");
				else {
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

	
}
