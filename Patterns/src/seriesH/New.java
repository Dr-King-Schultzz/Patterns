package seriesH;

//printing 1 2 3 4 5 6 7 6 5 4 3 2 1 series
//printing 1 10 100 1000 10000 10000 1000 100 10 1 

public class New {
	public static void main(String[] args) {



		/*for(int i=1;i<=7;i++){

			System.out.print(i+" ");
			
		}
		for(int j=6;j>=1;j--){
			System.out.print(j+" ");
		}*/
		
		//---------------------------------------------------------
		
		
		for(int i=1;i<=10000;i=i*10){

			System.out.print(i+" ");
			
		}
		for(int j=10000;j>=1;j=j/10){
			System.out.print(j+" ");
		}

	}
}