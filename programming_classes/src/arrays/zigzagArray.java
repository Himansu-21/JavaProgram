package arrays;

public class zigzagArray {
	public static void main(String[] args) {
		//first Array
		int[] ar = ArrayOperations.readarray();

		//Second Array
		int[] br = ArrayOperations.readarray();

		//Third Array
		int[] cr = new int[ar.length+br.length];
		isMerge(ar,br,cr);
	}

	public static void isMerge(int[] ar,int[] br,int[] cr) {

		int i=0;
		int j=0;
		int k=0;

		while(k<cr.length)
		{
			if(i<ar.length)
			{
				cr[k++]=ar[i++];
				
			}

			if(j<br.length)
			{
				cr[k++] = br[j++];
				
			}
			ArrayOperations.display(cr);
		}


	}
}
