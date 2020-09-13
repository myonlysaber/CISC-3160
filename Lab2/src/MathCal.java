import java.util.Scanner;

public class MathCal {

	public static double FtoC(double f) {            //method to calculate Fahrenheit to Celsius
		return (f-32)*5/9;
	}
	public static double CtoF(double c) {			//method to calculate Celsius to Fahrenheit
		return ((9*c)/5)+32;
	}
	public static void main(String[] args) {
		double F, C;                                   // variable for Fahrenheit and Celsius
		int k;											//variable to decide which method to use
		Scanner sc = new Scanner(System.in);            //make scanner to read user input
		
		System.out.println("Convert Fahrenheit to Celsius enter 1, Convert Celsius to Fahrenheit enter 2");        //prompt user to choose which method
			k = sc.nextInt();																						//scan user input to variable k
		if(k == 1) {																								//user choose convert Fahrenheit to Celsius
			for(int i=0; i<7; i++){
				System.out.println("Enter Fahrenheit temperture for day " + (i+1) + " of the week");				//get weather of the week in Fahrenheit
					F = sc.nextDouble();																			
				System.out.println("The Celsius temperature for day " + (i+1) + " is " + FtoC(F) + " degree\n");	//output weather of the week in Celsius
			}
		}
		else if(k == 2) {																								//user choose convert Celsius to Fahrenheit 
			for(int i=0; i<7; i++){																					
				System.out.println("Enter Celsius temperture for day " + (i+1) + " of the week");							//get weather of the week in Celsius
					C = sc.nextDouble();
				System.out.println("The Fahrenheit temperature for day " + (i+1) + " is " + CtoF(C) + " degree\n" );		//output weather of the week in Fahrenheit
			}
		}
		else 
			System.out.println("There is a error!");  //output an error for input other than Fahrenheit to Celsius or Celsius to Fahrenheit
		sc.close();
	}

}
