package arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int [] ar = {1,2,3,4};
		int [] br = {15,16,17,18};
		
		int [] cr = new int[ar.length + br.length];
		
		for(int i=0;i<ar.length;i++) {
			cr[i]= ar[i];
			System.out.println(cr[i]);
		}
		
		for(int j=0;j<br.length;j++) {
			cr[ar.length+j] =br[j];
			System.out.println(cr[ar.length+j]);
		}
		
		
	}
}
