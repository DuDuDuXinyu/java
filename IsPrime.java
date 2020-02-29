
	//系统开始执行一个程序前,并没有创建main()方法所在类的实例对象
	//它只能通过类名类调用主方法main()作为程序入口,所以该方法是static

	//为什么是String args[]或者String[] args
	//这表示给主方法传一个字符串数组,字符串名是args
	//args是一个参数名可以随意改变，但是必须是String
	//接收键盘输入
public class IsPrime
{
	public static void main(String[]args){
		

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入你所要判断的数字：");

		//将键盘输入的数字保存在sum中

		int sum = s.nextInt();

		//开始判断是否为素数

		boolean res = true;//默认输入的数字先是一个素数
		for(int i = 2; i < sum; i++){
			if(sum % i == 0){
				//非素数
				res = false;
				break;
			}
		}
		System.out.print(res ? sum + "是素数！" : sum + "不是素数！");
	}
}