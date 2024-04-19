class Max2_Min2
{
	public static void main(String ar[])
	{
		int a[] = new int[10];
		int max1,max2=0,min1,min2=0;
		for(int i=0;i<10;i++)
		{
			a[i]=(int)(1000 * Math.random());
			System.out.print(a[i]+" ");
		}
		System.out.println();
		max1=a[0];max2=a[0];
		min1=a[0];min2=a[0];
		for(int i=1;i<10;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];								
			}
			else if(a[i]>max2)
					max2=a[i];
			
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];				
			}
			else if(a[i]<min2)
					min2=a[i];		
			
		}
		System.out.println("2nd maximum:"+max2+" 2nd minimum:"+min2);
	}
}