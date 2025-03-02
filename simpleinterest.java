import java.util.Scanner;
class simpleinterest {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("enter the principal:");
	double principal= input.nextDouble();
	System.out.print("enter the rate:");
	double rate= input.nextDouble();
	System.out.print("enter the time:");
	double time= input.nextDouble();
	double interest=(principal*time*rate)/100;
	System.out.println("principal:"+principal);
	System.out.println("interest rate:"+rate);
	System.out.println("time duration:"+time);
	System.out.println("simple interest:"+interest);
	input.close();
	}
}
