import static org.junit.Assert.*;

import org.junit.Test;

public class AverageCalculatorTest {
	
	@Test
	public void calculateAverage() {
		AverageCalculatorTest test2 = new AverageCalculatorTest(); 
		
		//arrange
		AverageCalculator sut = new AverageCalculator();  
		double[] input = new double[] {1.5, 2.5, 6.0, 10.0};

		//act
		double result = sut.calculateAverage(input);
		
		
		//assert
		test2.equals(5.0, result);
	}
		
		private boolean equals(double d, double result) {			
			if (d == result) {
				return true;
			}
			
			else {
			 	fail("");
			 	return false;}
		}
		
		
	}


