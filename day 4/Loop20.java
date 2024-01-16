class Loop20
{
	public static void main(String[]arg)
	{
		int i,j; 
		for(i=1;i<=7;i++)
		{
		
			for(j=7;j>=i;j--)
			{
				 System.out.print(j%2);
			
			}
		
			
			System.out.println(" ");
		}
	}
}