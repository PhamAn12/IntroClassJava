package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_015 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_015 mainClass = new grade_93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_015();
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
        FloatObj score = new FloatObj(), A = new FloatObj(), B = new FloatObj(), C = new FloatObj(), D = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D \n in that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextFloat();
        if((score.value >= (A.value))){
            output += (String.format("Student has an A grade\n"));
        } else if((score.value >= (B.value)) && (score.value < (A.value))){
            output += (String.format("Student has an B grade\n"));
        }         else if((score.value >= (C.value)) && (score.value < (B.value))){
            output += (String.format("Student has an C grade\n"));
        }         else if((score.value >= (D.value)) && (score.value < (C.value))){
            output += (String.format("Student has an D grade\n"));
        }         else if((score.value < (D.value))){
            output += (String.format("Student has an F grade\n"));
        }
        if(true)return;;
    }
}