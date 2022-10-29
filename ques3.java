
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		for(int i =0; i<2*n ; i++) {
			for(int j =i; j<n; j++) {
				System.out.print("*");
			}
			for(int j =0; j<2*i && i<n; j++) {
				System.out.print(" ");
			}
			for(int j =0; j<n-i; j++) {
				System.out.print("*");
			}
			if(i>=n) {
				for(int j =0; j<n*2; j++) {
					if(j==0||i==2*n-1||j==2*n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
			
			System.out.println("");
		}
	}
	
}

