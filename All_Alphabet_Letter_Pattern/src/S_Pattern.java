// S Pattern
public class S_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9 ;
		int mid=(n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==1 || i==mid || i==n || (j==1 && i<=mid) || (j==n && i>=mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
