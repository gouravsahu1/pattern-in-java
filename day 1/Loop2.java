class Loop2
{
	public static void main(String[]arg)
	{
		int i,j,k=1;
		for(i=5;i>=1;i--)
		{
			k=1;
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d",k);
				k++;	
			}
			System.out.println(" ");
		}
	}
}