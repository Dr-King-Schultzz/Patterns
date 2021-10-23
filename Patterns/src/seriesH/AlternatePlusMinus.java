package seriesH;

// Printing -1 2 -3 4 -5 6 -7 8 -9 10 

public class AlternatePlusMinus {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				System.out.print(i*-1+" ");
			else{
				System.out.print(i+" ");
			}

		}

	}
}