package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006 mainClass = new checksum_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_006();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}