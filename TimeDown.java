public class TimeDown
{
	public static void main(String []args){
		System.out.print("请输入倒计时的时间（以秒为单位）： ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int num=s.nextInt();
		int a=num;
		while(num!=0){
			//方法一：
			//System.out.print(num+"\r");
			//方法二：
			System.out.print(num);
			System.out.print("\r");
			num--;

			//线程终端也就是睡眠
			//固定格式

			try {
                 Thread.sleep(1000);
 
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }


		}
		System.out.print(a+"s时间已经到了！");
	}
}