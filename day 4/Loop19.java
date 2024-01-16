class Loop19
{
	public static void main(String[]arg)
	{
		int i,j; 
		for(i=7;i>=1;i--)
		{
		
			for(j=i;j<=7;j++)
			{
				 /*if(j%2==1) logic 1
				System.out.print("1 ");
			    
			     else
				 System.out.print("0 "); now logic 2*/
			    System.out.print(j%2);
			
			}
		
			
			System.out.println(" ");
		}
	}
}