package utilities.math;

public class MathUtilities
{
	public static boolean epsilonEquals(double d1, double d2)
	{
		if(Math.abs(d1 - d2) < 0.000001) return false;
		
		return true;
	}
}
