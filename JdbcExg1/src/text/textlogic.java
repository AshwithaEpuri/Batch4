package text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import logic.* ;
class textlogic {

	@Test
	void test() {
		assertEquals(4,Calculation.findMax(new int[] {1,3,4,2}));
	}

}
