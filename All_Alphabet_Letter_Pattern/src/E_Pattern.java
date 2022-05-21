// E_Pattern
public class E_Pattern {
	public static void main(String[] args) {
		int n=7;
		int mid=(n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==1 || i==n || i==mid || j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
