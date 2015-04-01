import java.util.Scanner;
public class MathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the x value");
		
		
		x= input.nextByte();
		System.out.println("Enter the y value");
		y=input.nextByte();
		System.out.println("Enter the z value");
		z=input.nextByte();
		System.out.println("The value of h is "  + h(x));
		System.out.println("The value of f is " + f(x,y));
		System.out.println("The value of g is "+ g(x,y,z));
	}
public static int h(int x){
	return x*x*x*x*x*x*x*x*x*x;
}
public static int f(int x , int y){
	return x+y;
}
static Scanner keyboard = new Scanner(System.in);
public static double g(double x, double y , double z){
	byte a,b,c ;
	a =(byte) Math.sqrt(x);
	b =(byte) Math.abs(y);
	c =(byte) Math.pow(z,y);
	return a+b+c;
	
	
	
}


	

	
}




