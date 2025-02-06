import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String yippie = in.nextLine();
		System.out.println(yippie.charAt(0));
		

		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean notboo = in.nextBoolean();
		in.nextLine();
		System.out.println(!notboo);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int greaterthan5 = in.nextInt();
		in.nextLine();
		System.out.println(greaterthan5 > 5);
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double two = in.nextDouble();
		in.nextLine();
		System.out.println(two >= -2 && two <= 2 );

		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String helloworld = in.nextLine();
		System.out.println(helloworld.equals("Hello World"));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int firstimput = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int secondimput = in.nextInt();
		in.nextLine();
		System.out.println(firstimput <= secondimput);
		
	}

	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double firstdouble = in.nextDouble();
		in.nextLine();
		System.out.print("In: ");
		double seconddouble = in.nextDouble();
		in.nextLine();
		System.out.println(firstdouble > seconddouble);
		
	}

}
