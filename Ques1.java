
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<9; i++) {
			//for i
			for(int j = 0; j<10; j++) {
				if(i==0 || i==8) {
					System.out.print("*");
				}
				else if(j!=5) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.print("   ");
			// for N
			for(int j = 0; j<10; j++) {
				if(j==0 || j==9) {
					System.out.print("*");
				}
				else if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//for E
			for(int j = 0; j<10; j++) {
				if(j==0 || i==0 || i==4 || i==8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//for U
			for(int j = 0; j<10; j++) {
				if(j==0 || j==9) {
					System.out.print("*");
				}
				else if(i==8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//FOR R
			for(int j = 0; j<10; j++) {
				if(j==0 || i==0 || i==4 || (j==9 && i<5)) {
					System.out.print("*");
				}
				else if(i>4 && i==j ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// for O
			for(int j = 0; j<10;j++) {
				if(i==0 || i ==8 || j==0 || j==9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// for N
			for(int j = 0; j<10; j++) {
				if(j==0 || j==9) {
					System.out.print("*");
				}
				else if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
		
	}

}
