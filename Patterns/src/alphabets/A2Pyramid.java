package alphabets;

public class A2Pyramid {

	public static void main(String[] args) {
		int alpha = 65;
		for(int i=0;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print(" ");
			}
			int temp=1;
			for(int k=1;k<=i;k++){
				System.out.print((char)(alpha-1+temp)+" ");
				temp=temp*(i-k)/k;
			}
					System.out.println();
				
			
		}

	}

}
