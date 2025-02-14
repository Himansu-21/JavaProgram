package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int [] ar= {8,4,3,7,5,2};
		int flargest=ar[0];
		int slargest=ar[1];

		for(int i=1;i<ar.length;i++) {

			if(ar[i]>flargest)
			{
				slargest = flargest;
				flargest=ar[i];
			}
			else if(ar[i]>slargest && ar[i]!=flargest) {
				slargest=ar[i];
			}
			
		}

		System.out.println("Second Largest Element is "+slargest);
	}

}


