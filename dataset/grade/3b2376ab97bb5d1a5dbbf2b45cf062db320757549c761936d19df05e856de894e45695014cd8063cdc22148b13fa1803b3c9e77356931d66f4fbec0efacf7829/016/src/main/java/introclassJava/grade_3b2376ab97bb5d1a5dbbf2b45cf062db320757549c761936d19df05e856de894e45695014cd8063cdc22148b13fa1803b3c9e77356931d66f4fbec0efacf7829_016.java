package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_016 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_016 mainClass = new grade_3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_016();
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
        FloatObj A = new FloatObj(), B = new FloatObj(), C = new FloatObj(), D = new FloatObj(), grade = new FloatObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat();
        B.value = scanner.nextFloat();
        C.value = scanner.nextFloat();
        D.value = scanner.nextFloat();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        grade.value = scanner.nextFloat();
        if(grade.value >= A.value){
            output += (String.format("Student has an A grade"));
        } else if(A.value > grade.value && grade.value >= B.value){
            output += (String.format("Student has an B grade"));
        }         else if(B.value > grade.value && grade.value >= C.value){
            output += (String.format("Student has an C grade"));
        }         else if(C.value > grade.value && grade.value >= D.value){
            output += (String.format("Student has an D grade"));
        }         else {
            output += (String.format("Student has failed the course"));
        }
        output += (String.format("\n"));
        if(true)return;;
    }
}