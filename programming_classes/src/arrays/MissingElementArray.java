package arrays;

public class MissingElementArray {
	public static void main(String[] args) {
		int [] ar = ArrayOperations.readarray();
		
		int min =ar[0];
		int max = ar[ar.length-1]; 
		int j = 0;
		for(int i=min;i<=max;i++) {
			if(i!=ar[j])
				System.out.print(i+",");
			else
				j++;
		}
	}

}
