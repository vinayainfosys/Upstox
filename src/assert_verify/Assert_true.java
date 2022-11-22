package assert_verify;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Assert_true {
	@Test
	public void tc1() {
		boolean actR=true;
		assertFalse(actR);
	}

}
