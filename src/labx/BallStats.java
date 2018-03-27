package labx;
import java.util.Scanner;
import java.math.*;

public class BallStats 
{
	private String name;
	private double shotattempts;
	public double shotsmade;
	public double fgpercent;
	public double fgfinal;
	
	public void readinput()
	{
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		shotattempts = input.nextInt();
		shotsmade = input.nextInt();
		input.close();
		
		
	}
	
	public double barkley()
	{
	fgpercent = (shotsmade/shotattempts)*100;
	 fgfinal = Math.round(fgpercent);
	
	return fgfinal;
	}
	public void shaq()
	{
		System.out.println("Hello "+name+ " You made " +shotsmade+ " out of " +shotattempts+ "  shots resulting in a field goal percentage of " +fgfinal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
