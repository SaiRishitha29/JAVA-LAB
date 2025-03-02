import java.util.Scanner;
class celsiustofahrenheit {
	public static void main(String[] args){
	//input temperature in Celsius
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the temperature in Celsius:");
	  double celsius=sc.nextDouble();
	  double fahrenheit;
	  fahrenheit=(celsius*1.8)+32;
	  System.out.println("value of temperature in Fahrenheit:"+fahrenheit);
 	}
}