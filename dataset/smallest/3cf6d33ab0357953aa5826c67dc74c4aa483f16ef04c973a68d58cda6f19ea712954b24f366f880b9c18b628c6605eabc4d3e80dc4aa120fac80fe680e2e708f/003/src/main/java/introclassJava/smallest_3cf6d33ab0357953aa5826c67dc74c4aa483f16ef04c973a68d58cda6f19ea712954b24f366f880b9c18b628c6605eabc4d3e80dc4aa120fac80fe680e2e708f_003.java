package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003 mainClass = new smallest_3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003();
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
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c = new DoubleObj(), d = new DoubleObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        if(a.value < b.value && a.value < c.value && a.value < d.value){
            output += (String.format("%.0f is the smallest\n", a.value));
        } else if(b.value < a.value && b.value < c.value && b.value < d.value){
            output += (String.format("%.0f is the smallest\n", b.value));
        }         else if(c.value < a.value && c.value < b.value && c.value < d.value){
            output += (String.format("%.0f is the smallest\n", c.value));
        }         else if(d.value < a.value && d.value < b.value && d.value < c.value){
            output += (String.format("%.0f is the smallest\n", d.value));
        }
        if(true)return;;
    }
}