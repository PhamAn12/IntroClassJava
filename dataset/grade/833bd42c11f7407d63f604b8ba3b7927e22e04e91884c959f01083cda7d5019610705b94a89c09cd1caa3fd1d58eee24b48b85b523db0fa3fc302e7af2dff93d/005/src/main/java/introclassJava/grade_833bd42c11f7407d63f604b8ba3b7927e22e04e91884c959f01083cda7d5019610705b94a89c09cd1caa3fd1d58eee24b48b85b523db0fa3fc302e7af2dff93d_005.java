package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_833bd42c11f7407d63f604b8ba3b7927e22e04e91884c959f01083cda7d5019610705b94a89c09cd1caa3fd1d58eee24b48b85b523db0fa3fc302e7af2dff93d_005 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_833bd42c11f7407d63f604b8ba3b7927e22e04e91884c959f01083cda7d5019610705b94a89c09cd1caa3fd1d58eee24b48b85b523db0fa3fc302e7af2dff93d_005 mainClass = new grade_833bd42c11f7407d63f604b8ba3b7927e22e04e91884c959f01083cda7d5019610705b94a89c09cd1caa3fd1d58eee24b48b85b523db0fa3fc302e7af2dff93d_005();
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
        DoubleObj grade_a = new DoubleObj(), grade_b = new DoubleObj(), grade_c = new DoubleObj(), grade_d = new DoubleObj(), student_score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        grade_a.value = scanner.nextDouble();
        grade_b.value = scanner.nextDouble();
        grade_c.value = scanner.nextDouble();
        grade_d.value = scanner.nextDouble();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        student_score.value = scanner.nextDouble();
        if(student_score.value >= grade_a.value){
            output += (String.format("Student has an A grade\n"));
        } else if(student_score.value >= grade_b.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(student_score.value >= grade_c.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(student_score.value >= grade_d.value){
            output += (String.format("Student has an D grade\n"));
        }         else {
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}