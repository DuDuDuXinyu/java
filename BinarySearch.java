public class BinarySearch
{
	public static void main(String []args){
		int []arr={0,1,2,3,4,5,6,7,8,9};
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入您的要查找的元素 ： ");
		int num = s.nextInt();
		int ret = sort(arr,num);
		System.out.println(ret);
	}
	public static int sort(int []arr,int num){
		int left=0,right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(num>arr[mid])
			{
				left=mid+1;
			}
			else if(num<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}

}