public class BubbleSort
{
	public static void main(String []args)
	{
		int num[]={9,6,3,8,2,1,5,7,4,0};
		BubbleSort.sort(num);
		for(int i=0;i<10;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void sort(int []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
	}
}