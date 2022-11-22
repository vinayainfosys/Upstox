package assert_verify;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;


public class AssertEquals {
	@Test
	public void tc1() {
		String actT="Khadija";
		String expT="Khadija";
		assertNotEquals(actT,expT);
	}

}
