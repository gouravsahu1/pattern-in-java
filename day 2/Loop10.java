class Loop10
{
	public static void main(String[]arg)
	{
		int i,j;
		// System.out.println("6");
		for(i=1;i<=6;i++)
		{
		
			for(j=1;j<i;j++)
			{
				System.out.printf("%d ",j);
			}
			System.out.print("6 ");
			System.out.println("  ");
		}
	}
}