class Loop1
{
	public static void main(String[]arg)
	{
		int i,j,k=1;
		for(i=1;i<=5;i++)
		{
			k=1;
			for(j=1;j<=5;j++)
			{
				System.out.printf("%d",k);
				k++;	
			}
			System.out.println(" ");
		}
	}
}