package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002 mainClass = new syllables_fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca_002();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}