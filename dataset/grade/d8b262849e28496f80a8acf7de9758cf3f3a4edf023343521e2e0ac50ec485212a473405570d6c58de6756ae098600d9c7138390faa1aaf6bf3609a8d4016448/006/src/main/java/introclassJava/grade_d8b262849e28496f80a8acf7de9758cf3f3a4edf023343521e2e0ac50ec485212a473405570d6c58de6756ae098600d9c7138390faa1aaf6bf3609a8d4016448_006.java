package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_006 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_006 mainClass = new grade_d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_006();
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
        DoubleObj A = new DoubleObj(), B = new DoubleObj(), C = new DoubleObj(), D = new DoubleObj(), score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextDouble();
        B.value = scanner.nextDouble();
        C.value = scanner.nextDouble();
        D.value = scanner.nextDouble();
        output += (String.format("Thank you. Now enter student score (percent) > "));
        score.value = scanner.nextDouble();
        if(score.value < D.value){
            output += (String.format("Student has failed the course\n"));
        } else if(score.value >= D.value && score.value < C.value){
            output += (String.format("Student has an D grade\n"));
        }         else if(score.value >= C.value && score.value < B.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(score.value >= B.value && score.value < A.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(score.value >= A.value){
            output += (String.format("Student has an A grade\n"));
        }
        if(true)return;;
    }
}