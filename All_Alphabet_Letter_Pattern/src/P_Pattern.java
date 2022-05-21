// P Pattern
public class P_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int mid = (n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(j==1 || i==1 || i==mid || (j==n && i<=mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}		

	}

}
