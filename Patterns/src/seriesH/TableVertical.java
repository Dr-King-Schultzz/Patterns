package seriesH;

public class TableVertical {
	
public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j=1; j <= 10;j++)
			{
				if(i*j<=9){
					System.out.print("0"+i*j+" ");
				}
				else
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}



}
