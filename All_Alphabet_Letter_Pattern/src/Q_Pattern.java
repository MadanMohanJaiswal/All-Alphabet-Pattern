// Q Pattern
public class Q_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int mid = (n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if((i==1 && j<=mid+2) || (i== mid+2 && j<=mid+2) || (j==1 && i<=mid+2) || (j==mid+2 && i<=mid+2) || (i==j && i>=mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}		

	}

}
