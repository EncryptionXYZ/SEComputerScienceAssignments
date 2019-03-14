public class StringPractice
{

public static void main (String[] args)
{

	
	String s1 = "The quick brown fox jumps over the lazy dogs.";
	String s2 = "Mississippi";
	String s3 = "Mohamed Ali";
	String s4 = "mississippi";
	
	Print(s1);
	Print(s2);
	Print(s3);
	Print(s4);
	
	Upper(s1);
	Upper(s2);
	Upper(s3);
	Upper(s4);
	
	Lower(s1);
	Lower(s2);
	Lower(s3);
	Lower(s4);
	
	

	
		if(s2.equals(s4))
		{
			System.out.println("String 2 is equal to string 4");
		}
		
		else
		{
			System.out.println("String 2 is not equal to string 4");
		}
		
		
		
		
		
		if(s2.equalsIgnoreCase(s4))
		{
			System.out.println("String 2 is equal to string 4 in terms of ignoring case sensitive");
		}
		
		else
		{
			System.out.println("String 2 is not equal to string 4 in terms of ignoring case sensitive");
		}
	
		


	String s5 = "The quick brown fox jumps over the lazy dogs.";
	String s6 = "Mississippi";
	String s7 = "Mohamed Ali";
	String s8 = "mississippi";
	
	
	
	System.out.println("----");
	
	
	charAt(s5, 6);
	charAt(s6, 6);
	charAt(s7, 6);
	charAt(s8, 6);
	
	
	System.out.println("----");
	
	charAt(s5, 3);
	charAt(s6, 3);
	charAt(s7, 3);
	charAt(s8, 3);
	
	
	System.out.println("----");
	
	charAt(s5, 9);
	charAt(s6, 9);
	charAt(s7, 9);
	charAt(s8, 9);
	
	System.out.println("----");	
		
	//CONCATIAOIONANANA
	String s9 = s6.concat(s1);
	System.out.println(s9);
	//
	String s10 = s7.concat(s8);
	System.out.println(s10);
	//COMNCATANANANANNANANA
	
	//replace
	String s11 = s5.replace('s', 'z');
	String s12 = s6.replace('s','z');
	String s13 = s7.replace('s',  'z');
	String s14 = s8.replace('s', 'z');
	//done with replace
	
	
	String s15 = "The quick brown fox jumps over the lazy dogs.";
	String s16 = "Mississippi";
	String s17 = "Mohamed Ali";
	String s18 = "mississippi";
	
	
	System.out.println(s15.substring(0,4));
	System.out.println(s16.substring(0,4));
	System.out.println(s17.substring(0,4));
	System.out.println(s18.substring(0,4));
	
	System.out.println(s15.substring(3,8));
	System.out.println(s16.substring(3,8));
	System.out.println(s17.substring(3,8));
	System.out.println(s18.substring(3,8));

}	








	public static void Print(String s)
	{
		System.out.println("The length of string " + s + " is "+ s.length());
	}
	
	
		public static void Upper(String s)
	{
		System.out.println(s.toUpperCase());
	}
	
		public static void Lower(String s)
	{
		System.out.println(s.toLowerCase());
	}


	public static void charAt (String s, int position)
	{
		System.out.println("String s" + " and has a character position of " + position + "and returns the value of " + s.charAt(position));
	}
	
	

	

	

	
	




	











}