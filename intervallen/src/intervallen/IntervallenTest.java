package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval();
		myInterval.setOndergrens(3);
		myInterval.setBovengrens(7);
		int length = myInterval.getLength();
		assertEquals(4, length);
	}

}
