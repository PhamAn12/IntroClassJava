package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011 mainClass = new checksum_08c7ea4ac39aa6a5ab206393bb4412de9d2c365ecdda9c1b391be963c1811014ed23d2722d7433b8e8a95305eee314d39da4950f31e01f9147f90af91a5c433a_011();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}