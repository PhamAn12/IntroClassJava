package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000 mainClass = new median_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000();
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
        IntObj n1 = new IntObj(), n2 = new IntObj(), n3 = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt();
        n2.value = scanner.nextInt();
        n3.value = scanner.nextInt();
        if((n1.value > n2.value) && (n1.value > n3.value) && (n2.value > n3.value)){
            output += (String.format("%d is the median\n", n2.value));
        } else if((n1.value > n2.value) && (n1.value > n3.value) && (n3.value > n2.value)){
            output += (String.format("%d is the median\n", n3.value));
        }         else if((n2.value > n1.value) && (n2.value > n3.value) && (n3.value > n1.value)){
            output += (String.format("%d is the median\n", n3.value));
        }         else if((n2.value > n1.value) && (n2.value > n3.value) && (n1.value > n3.value)){
            output += (String.format("%d is the median\n", n1.value));
        }         else if((n3.value > n1.value) && (n3.value > n2.value) && (n1.value > n2.value)){
            output += (String.format("%d is the median\n", n1.value));
        }         else if((n3.value > n1.value) && (n3.value > n2.value) && (n2.value > n1.value)){
            output += (String.format("%d is the median\n", n2.value));
        }
        if(true)return;;
    }
}