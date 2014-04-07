package algorithms;

import java.util.Random;

/**
 * shuffe array randomly
 * @author CT61557
 *
 */
public class ShuffleArray {

	public void shuffleArray(char[] arr){
		final int len = arr.length;
		int i=len,j;
		char temp;
		Random generator = new Random();
		if(i==0){
			return;
		}
		while(--i>0){
			j=generator.nextInt() %(i+1);
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
