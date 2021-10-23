package seriesH;
// Printing 1 2 3 4 5 6 5 4 3 2 1  using SINGLE FOR LOOP
public class AAA {
	public static void main(String[] args) {
		int n=1;

		for(int i=1;i<=11;i++){
			
			if(i<=5){
				System.out.print(n+" ");
				n++;
			}
			else{
				System.out.print(n+" ");
				n--;
			}

		}

	}
}