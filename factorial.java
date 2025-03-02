import java.util.Scanner;
class factorial{
	public static void main (String[] args){
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("enter the n value:");
		int n = input.nextInt();
		int factorial = 1;
	//for loop
	for (int i=1;i<=n; i++){
		//body inside for loop
		factorial*=i;//factorial =factorial*i
		}
	System.out.println("Factorial="+factorial);
	}
}

}