package Pattern_Programming;

public class Patt_M {
	public static void main(String[] args) {
		int n =3;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j==1||j==2*n-1|| (i==j && i<=n) || (i+j==n*2&&i<=n)) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
