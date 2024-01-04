class Loop15
{
	public static void main(String[]arg)
	{
		int i,j;
		// System.out.println("6");
		for(i=1;i<=5;i++)
		{
		
			for(j=1;j<=5;j++)
			{
				if(j<=i)
				System.out.printf("%d ",j);
				else
				System.out.print("* ");
			}
			
			
			System.out.println(" ");
		}
	}
}