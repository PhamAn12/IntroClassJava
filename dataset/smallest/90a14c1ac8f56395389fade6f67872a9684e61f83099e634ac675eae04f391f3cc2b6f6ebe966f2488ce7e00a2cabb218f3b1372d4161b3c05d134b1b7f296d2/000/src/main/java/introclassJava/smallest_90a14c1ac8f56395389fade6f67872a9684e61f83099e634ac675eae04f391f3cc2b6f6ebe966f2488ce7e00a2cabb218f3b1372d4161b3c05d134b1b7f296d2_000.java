package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000 mainClass = new smallest_90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000();
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
        IntObj one = new IntObj(), two = new IntObj(), three = new IntObj(), four = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        one.value = scanner.nextInt();
        two.value = scanner.nextInt();
        three.value = scanner.nextInt();
        four.value = scanner.nextInt();
        if((one.value < two.value) && (two.value < three.value) && (three.value < four.value)){
            output += (String.format("%d is the smallest\n", one.value));
        }
        if((two.value < one.value) && (one.value < three.value) && (three.value < four.value)){
            output += (String.format("%d is the smallest\n", two.value));
        }
        if((three.value < one.value) && (one.value < two.value) && (two.value < four.value)){
            output += (String.format("%d is the smallest\n", three.value));
        }
        if((four.value < one.value) && (one.value < two.value) && (two.value < three.value)){
            output += (String.format("%d is the smallest\n", four.value));
        }
        if(true)return;;
    }
}