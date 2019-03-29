public class survey
{
	public static void main(String[] args)
	{
		int [] responses = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
		
		
		System.out.println(responses.length);
		
		int idc;
		int idk;
		int momma = 0;
		int daddy= 0;
		int bobby=0;
		int wassaby=0;
		int gingy=0;
		int garry=0;
		int jerry=0;
		int marry=0;
		int aarry=0;
		int karry=0;
		
		

		for(idk = 0; idk < 40; idk++)
		{
		
			idc = responses[idk];
		
			
			if(idc == 1)
			{
				momma++;
			}
			if(idc == 2)
			{
				daddy++;
			}
			
			if(idc == 3)
			{
				bobby++;
			}
			
			if(idc == 4)
			{
				wassaby++;
			}
			if(idc == 5)
			{
				gingy++;
			}
			if(idc == 6)
			{
				garry++;
			}
			if(idc == 7)
			{
				jerry++;
			}
			if(idc == 8)
			{
				marry++;
			}
			if(idc == 9)
			{
				aarry++;
			}
			if(idc == 10)
			{
				karry++;
			}
				}
		
			System.out.println("Momma Store has a rating of: " + momma);
			System.out.println("Daddy Store has a rating of: " + daddy);
			System.out.println("Bobby Store has a rating of: " + bobby);
			System.out.println("Wassaby Store has a rating of: " + wassaby);
			System.out.println("gingy Store has a rating of: " + gingy);
			System.out.println("garry Store has a rating of: " + garry);
			System.out.println("jerry Store has a rating of: " + jerry);
			System.out.println("Marry Store has a rating of: " + marry);
			System.out.println("Aarry Store has a rating of: " + aarry);
			System.out.println("Karry Store has a rating of: " + karry);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		
		
		
	}
}