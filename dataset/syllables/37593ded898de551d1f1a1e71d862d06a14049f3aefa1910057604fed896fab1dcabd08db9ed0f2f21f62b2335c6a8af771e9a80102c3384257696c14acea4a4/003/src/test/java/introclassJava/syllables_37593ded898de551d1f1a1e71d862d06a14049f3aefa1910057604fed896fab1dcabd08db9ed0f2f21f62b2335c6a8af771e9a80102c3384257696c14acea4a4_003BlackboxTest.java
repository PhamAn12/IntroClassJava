package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003 mainClass = new syllables_37593ded898de551d1f1a1e71d862d06a14049f3aefa1910057604fed896fab1dcabd08db9ed0f2f21f62b2335c6a8af771e9a80102c3384257696c14acea4a4_003();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}