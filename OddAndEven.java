public class OddAndEven
{
	public static void main(String []args){
		System.out.println("原数组：");
		int []arr={1,2,3,4,5,6,7,8,9,0};
		System.out.println(java.util.Arrays.toString(arr));
		method1(arr);
		System.out.println("奇数在前，偶数在后");
		System.out.println(java.util.Arrays.toString(arr));
		method2(arr);
		System.out.println("偶数在前，奇数在后");
		System.out.println(java.util.Arrays.toString(arr));
	}

	//奇数在前，偶数在后

	public static void method1(int []arr){
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(0==arr[i]%2){
				count++;
			}
			else{
				int temp=arr[i];
				arr[i] =arr[i-count];
				arr[i-count]=temp;
			}
		}
	}

	//偶数在前，奇数在后

	public static void method2(int []arr){
		int left=0,right=arr.length-1;
		while(left<right){
			if(arr[left]%2!=0){
				int temp=arr[left];
				arr[left] =arr[right];
				arr[right]=temp;
				right--;
			}
			else{
				left++;
			}
		}
	}
}