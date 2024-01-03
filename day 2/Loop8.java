class Loop8
{
	public static void main(String[]arg)
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
		
			for(j=5;j>=i;j--)
			{
				System.out.printf("%d",j);
			}
			System.out.println(" ");
		}
	}
}