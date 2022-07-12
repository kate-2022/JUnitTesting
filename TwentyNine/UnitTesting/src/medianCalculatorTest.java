import static org.junit.Assert.*;

import org.junit.Test;

public class medianCalculatorTest {

	@Test
	public void calculatesMedian() {
		medianCalculatorTest test = new medianCalculatorTest();
		
		//arrange
		MedianCalculator sut = new MedianCalculator();
		double[] input = new double[] {1.0, 4.0, 10.0};
		
		//act
		double result = sut.calculateMedian(input);
		
		//assert
		test.equals(4.0, result);
	
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

