package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_005 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_005 mainClass = new syllables_ca5057661022789c0b40bc1574ab8b0826b3d22f70de1a10b2d2122137774c6aec73fe789a94b2362628481da623120033956bd376b41b825a72dbd8b50aff2f_005();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        char[] inputString = new char[20];
        IntObj length = new IntObj(), k = new IntObj(), j = new IntObj(), syl = new IntObj();
        char[] vowels = new char[6];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        vowels[5] = 'y';
        CharObj temp = new CharObj();
        k.value = 0;
        j.value = 0;
        syl.value = 0;
        output += (String.format("Please enter a string > "));
        inputString = scanner.nextLine().toCharArray();
        length.value = inputString.length;
        for(k.value = 0; (k.value < length.value); k.value++) {
            temp.value = inputString[k.value];
            for(j.value = 0; (j.value < 6); j.value++) {
                if(temp.value == vowels[j.value]){
                    syl.value = syl.value + 1;
                    j.value = 99;
                }
            }
        }
        output += (String.format("The number of syllables is %d.", syl.value));
        if(true)return;;
    }
}