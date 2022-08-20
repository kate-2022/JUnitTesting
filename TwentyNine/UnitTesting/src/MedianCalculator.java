
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
		
		else {    
			int midValue1 = (int) numbersCloned[mid];
			int midValue2 = (int) numbersCloned[mid - 1];
			return (midValue1 + midValue2)/2;                      
			
		}
	
	}

}
