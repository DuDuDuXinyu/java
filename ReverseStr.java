public class ReverseStr
{
	public static void main(String []args){
		String str="i am a student";
		char []arr=str.toCharArray();
		fun(arr);
		String str1 = new String(arr);
		System.out.println(str1);
	}
	public static void reverse(char []arr,int k,int i){
		
		while(k<i){
			char temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
			i--;
			k++;
		}
	}

	public static void fun(char []arr){
		int left = 0, right = 0;
		reverse(arr, 0, arr.length - 1);

		int len=arr.length;
		while (len-->0)
		{
			if (arr[right] == ' ')
			{
				reverse(arr, left, right - 1);
				left = right + 1;
			}
			right++;
		}
		reverse(arr, left, right - 1);
	}
}