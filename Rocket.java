public class Rocket
{

	public static void main (String[] args)
	{
		
		System.out.println("   X   ");
		System.out.println(" X  X ");
		Middle();
		Bottom();
		System.out.println("X IN X");
		Bottom();
		Middle();
		Bottom();
		Fire();
		
		
	}
	
	public static void Middle()
	{
		System.out.println("X    X");
		System.out.println("X    X");
		System.out.println("X    X");
	}
	
	public static void Bottom()
	{
		System.out.println("XXXXXX");
	}
	
	public static void Fire()
	{
		System.out.println("/||||\\");
	}
	

	
}