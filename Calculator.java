public class Calculator
{
	
	public static void main (String []args){
		
		int choose=0;
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		while(choose<5)
		{
			menu();
			choose=scanner.nextInt();
			if(choose==5)
			{
				break;
			}
			switch(choose)
			{
				case 1:add();break;
				case 2:sub();break;
				case 3:mul();break;
				case 4:div();break;
				default:break;
			}
			
		}
	}

	public static void menu()
	{
		System.out.println("--------------------------");
		System.out.println("------欢迎使用计算器------");
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("   请选择你要做的计算 ：  ");
		System.out.println();
		System.out.println("   1、加法      2、减法   ");
		System.out.println();
		System.out.println("   3、乘法      4、除法   ");
		System.out.println();
		System.out.println("----------5、退出---------");
	}

	public static void add(){
		
		int a,b;
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("输入第一个加数 ： ");
		a=scanner.nextInt();
		System.out.println("输入第二个加数 ： ");
		b=scanner.nextInt();

		//加法运算

		int c=a+b;
		System.out.println(a+" + "+b+" = "+c);
	}
	public static void sub(){
		
		int a,b;
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("输入被减数 ： ");
		a=scanner.nextInt();
		System.out.println("输入减数 ： ");
		b=scanner.nextInt();

		//减法运算

		int c=a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
	public static void mul(){

		int a,b;
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("输入第一个乘数 ： ");
		a=scanner.nextInt();
		System.out.println("输入第二个乘数 ： ");
		b=scanner.nextInt();

		//乘法运算

		int c=a*b;
		System.out.println(a+" * "+b+" = "+c);
	}
	public static void div(){

		int a,b;
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("输入被除数 ： ");
		a=scanner.nextInt();
		System.out.println("输入除数 ： ");
		b=scanner.nextInt();

		//除法运算

		if(b==0){
			System.out.println("因为除数为0，所以无法计算！");
			return;
		}
		int c=a/b;
		System.out.println(a+" / "+b+" = "+c);
	}
}