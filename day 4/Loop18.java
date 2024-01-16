class Loop18
{
	public static void main(String[]arg)
	{
		int i,j; 
		for(i=1;i<=7;i++)
		{
		
			for(j=1;j<=i;j++)
			{
				if(j%2==1)
				System.out.print("1 ");
			    
			    else
				System.out.print("0 ");
			
			}
		
			
			System.out.println(" ");
		}
	}
}