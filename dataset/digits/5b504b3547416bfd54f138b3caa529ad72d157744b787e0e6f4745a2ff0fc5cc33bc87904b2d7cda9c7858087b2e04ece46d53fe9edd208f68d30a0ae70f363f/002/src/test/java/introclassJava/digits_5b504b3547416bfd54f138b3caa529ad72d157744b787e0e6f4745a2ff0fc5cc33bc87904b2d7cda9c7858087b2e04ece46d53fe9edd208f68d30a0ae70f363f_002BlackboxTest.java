package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  4 3 2 1 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  6 7 8 -9 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("-9876");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  2 7 2 0 3 7 3 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("3730272");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("8");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  4 7 3 9 8 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("89374");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002 mainClass = new digits_5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002();
		String expected = "Enter an integer >  6 6 6 6 6 6 6 That's all, have a nice day!";
		mainClass.scanner = new java.util.Scanner("6666666");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}