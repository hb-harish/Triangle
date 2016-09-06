import java.util.Scanner;


public class Triangle {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double num1, num2, num3;

	    System.out.print( "Enter lengths triangle in decreasing order of length" );
	    num1 = keyboard.nextDouble();
	    num2 = keyboard.nextDouble();
	    num3 = keyboard.nextDouble();
	    
	    if ((num1*num1)==(num2*num2 + num3*num3))
	    	System.out.println("Right Angle Triangle");
	    else if (num1==num2 && num3==num2)
	    	System.out.println("Equilateral Triangle");
		// TODO Auto-generated method stub

	}

}
