package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_007 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_007 mainClass = new digits_6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_007();
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
        IntObj n = new IntObj(), t = new IntObj(), d = new IntObj();
        output += (String.format("\nEnter an integer > "));
        n.value = scanner.nextInt();
        output += (String.format("\n"));
        t.value = n.value;
        if(n.value == 0){
            output += (String.format("0\n"));
        } else {
            while(n.value!=0){
                d.value = n.value % 10;
                n.value = n.value / 10;
                if((t.value < 0) && (n.value == 0)){
                    output += (String.format("-%d\n", Math.abs(d.value)));
                } else {
                    output += (String.format("%d\n", Math.abs(d.value)));
                }
            }
        }
        output += (String.format("That's all, have a nice day!\n"));
        if(true)return;;
    }
}