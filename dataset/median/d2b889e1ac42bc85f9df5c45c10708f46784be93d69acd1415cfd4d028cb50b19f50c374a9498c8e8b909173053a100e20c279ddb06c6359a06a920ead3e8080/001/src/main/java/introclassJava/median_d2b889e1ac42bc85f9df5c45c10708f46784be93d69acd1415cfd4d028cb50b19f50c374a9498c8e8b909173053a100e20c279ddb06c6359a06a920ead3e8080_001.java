package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class median_d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_001 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		median_d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_001 mainClass = new median_d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_001();
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
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj();
        output += (String.format("Please enter 3 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        if((a.value <= b.value && b.value <= c.value) || (c.value <= b.value && b.value <= a.value)){
            output += (String.format("%d is the median\n", b.value));
        } else if((b.value <= c.value && c.value <= a.value) || (a.value <= c.value && c.value <= b.value)){
            output += (String.format("%d is the median\n", c.value));
        }         else if((c.value <= a.value && a.value <= b.value) || (b.value <= a.value && a.value <= c.value)){
            output += (String.format("%d is the median\n", a.value));
        }
        if(true)return;;
    }
}