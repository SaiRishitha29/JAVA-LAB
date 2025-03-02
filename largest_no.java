import java.util.Scanner;
class largest_no {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the n1 value");
	int n1=sc.nextInt();
	System.out.println("enter the n2 value");
	int n2=sc.nextInt();
	System.out.println("enter the n3 value");
	int n3=sc.nextInt();
	//nested ternary operator
	//To find the largest number
	int largest=(n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
	System.out.println("Largest Number:"+largest);
	}
}
