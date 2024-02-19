package nothing;

public class triangle {

	public static void main(String[] args) {
		int n =6;
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*a-1;b++) {
				if(b==1 || b==2*a-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				
					
		
				}
			}
			System.out.println();
		}
		for(int a=n;a>=1;a--) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(" ");
		}
			for(int b=1;b<=2*a-1;b++) {
				if(b==1 || b==2*a-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
