package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000 mainClass = new syllables_0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LENGTH = 20;
    public void exec () throws Exception {
        char[] in = new char[LENGTH];
        IntObj len = new IntObj(), vowels = new IntObj(0), i = new IntObj();
        output += (String.format("Please enter a string > "));
        in = scanner.next().toCharArray();
        len.value = in.length;
        for(i.value = 0; i.value < len.value; i.value++) {
            if(in[i.value] == *("a") || in[i.value] == *("e") || in[i.value] == *("o") || in[i.value] == *("u") || in[i.value] == *("y")){
                vowels.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", vowels.value));
        if(true)return;;
    }
}