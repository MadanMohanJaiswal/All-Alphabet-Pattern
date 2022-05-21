// A pattern 
public class A_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int mid=(n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==1 || j==1 || j==n || i==mid)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println();
		}

	}

}
