
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1; i<=n ; i++) {
			for(int j = 0 ; j<i ; j++) {
				System.out.print("*");
			}
			for(int j = 0 ; j<2*n-2*i; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
