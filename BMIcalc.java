import java.util.Scanner;

public class BMIcalc {
  public static void main( String[] args )
  {

	 Scanner input = new Scanner(System.in );
	 double weight;
	 int inches;
	 
	 System.out.println( "Enter weight in pounds: " );
	 weight = input.nextFloat();
	 
	 System.out.print("Enter height in inches: ");
     inches = input.nextInt();

	 double weightInKilos = weight * 0.453592;
	 double heightInMeters = (( inches) * .0254);
	 double BMI = weightInKilos / (heightInMeters * heightInMeters);

	 
	 System.out.println( "Your weight in kilos is: " + weightInKilos);
	 System.out.println( "Your height in meters is: " + heightInMeters);  
	System.out.println( "Your BMI in metric units is: " + BMI);
	

	        
	
	
	 
	 
}

}
