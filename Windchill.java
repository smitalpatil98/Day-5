package Day_5_Basic_Core_Program;

public class Windchill 
{
	public static void main(String[] args) 
	{
		// Check if two command-line arguments are provided
		if (args.length != 2) 
		{
			System.out.println("Usage: java WindChill <temperature> <wind speed>");
			return;
		}

		// Parse temperature and wind speed from command-line arguments
		double temperature = Double.parseDouble(args[0]);
		double windSpeed = Double.parseDouble(args[1]);

		// Check if temperature is less than 50°F and wind speed is greater than or equal to 3 mph
		if (temperature > 50 || windSpeed < 3) 
		{
			System.out.println("Wind chill is not defined for temperatures above 50°F or wind speeds below 3 mph.");
			return;
		}

		// Calculate wind chill using National Weather Service formula
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
		+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);

		// Print the wind chill
		System.out.println("Wind chill: " + windChill);
	}
}

