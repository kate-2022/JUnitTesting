
public class AverageCalculator {
	
	public double calculateAverage (double[] numbers) {

		double sum = 0.0;
		int size = numbers.length;
		
		for (double singleNumber:numbers) {
			sum += singleNumber;
			return sum;}
		
		sum = sum/size;	
		return sum; 
		
	}
		
	}

