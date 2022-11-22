package assert_verify;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void tc1() {
		String s1="hiii";
		String s2="helloooo";
		org.testng.asserts.SoftAssert sa=new org.testng.asserts.SoftAssert();
		sa.assertEquals(s1, s2);
		System.out.println("hi, i am after failing 1st verification");
		sa.assertAll();
	}
	@Test
	public void tc2() {
		Reporter.log("running tc2",true);
	}

}
