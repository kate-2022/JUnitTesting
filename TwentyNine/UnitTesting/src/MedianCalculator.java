import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianCalculator {
	
	public double calculateMedian(double[] numbers) {
		
		double[] numbersCloned = (double[])numbers.clone();
		Arrays.sort(numbersCloned);
		int size = numbersCloned.length;
		int mid = size/2;
	  	
		if (size %2 !=0) {		
			return numbersCloned[mid];	
		}
		
		if (size %2 ==0) {
			return numbersCloned[(mid + mid-1)/2];	
			
		}
			return numbersCloned[mid];
	
		
	}

}
