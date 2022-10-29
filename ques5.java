
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i = 0; i<=2*n; i++) {
			for(int j=0; j<2*n;j++) {
				if(i==0 || i ==2*n) {
				System.out.print("*");
				}
				else if(i>=1 && i<=n && j<= n-i) {
					System.out.print("*");
				}
				else if(i>=n-1 && j<= i-n) {
						System.out.print("*");
					}
				
			}
//			System.out.println("");
//			for(int j=0; j<=n-i;j++) {
//				System.out.print("*");
//			}
//			for(int j=i; j<=n;j++) {
//				System.out.print("*");
//			}
			System.out.println("");
		}
	}

}
