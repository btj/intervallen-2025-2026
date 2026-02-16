package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval(3, 7);
		int length = myInterval.getLength();
		assertEquals(4, length);
	}

}
