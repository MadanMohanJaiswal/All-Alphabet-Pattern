// J Pattern
public class J_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int mid = (n+1)/2;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==1 || j==mid || (i-j == mid-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}		

	}

}
