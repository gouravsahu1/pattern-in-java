class Loop16
{
	public static void main(String[]arg)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
		
			for(j=1;j<=5;j++)
			{
				if(i%2==1)
				System.out.printf("%d ",j);
				else
				System.out.print("* ");
			}
			
			
			System.out.println(" ");
		}
	}
}