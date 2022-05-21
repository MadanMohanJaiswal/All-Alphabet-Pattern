// V Pattern
public class V_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int mid=(n+1)/2;
		for(int i=1 ;i<=mid ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==j || i+j == n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
