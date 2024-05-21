package Day_5_Basic_Core_Program;

public class Distance {

	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);

		Double Distance=Math.sqrt(x*x+y*y);
		System.out.println("The euclidesn distance from (" + x + "," + y + ") to (0,0) is" + Distance);
		//command Line argument 


	}

}
