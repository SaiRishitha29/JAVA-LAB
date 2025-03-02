import java.util.Scanner;

class Areaofrectangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length");
		int l = input.nextInt();
		System.out.println("enter the breadth");
		float b = input.nextFloat();
		System.out.println("Area of rectangle = " + l * b);
	}
}
	