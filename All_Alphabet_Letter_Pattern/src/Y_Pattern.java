// Y Pattern
public class Y_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int mid=(n+1)/2;
		for(int i=1 ;i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if((i==j && i<=mid) || (i+j==n+1 && i<=mid) || (j==mid && i>=mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
