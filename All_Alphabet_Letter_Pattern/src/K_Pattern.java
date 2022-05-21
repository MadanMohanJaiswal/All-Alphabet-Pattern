// K Pattern
public class K_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int mid = (n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(j==1 || (mid+1 == i+j) || (i-j == mid-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}		

	}

}
