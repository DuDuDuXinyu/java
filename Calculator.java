public class Calculator
{
	public static void main (String []args){
		Calculator.add(10,20);//30
		Calculator.sub(20,10);//10
		Calculator.mul(10,20);//200
		Calculator.div(20,10);//2
		Calculator.div(10,0);//无法计算
	}
	public static void add(int a,int b){

		//加法运算

		int c=a+b;
		System.out.println(a+" + "+b+" = "+c);
	}
	public static void sub(int a,int b){

		//减法运算

		int c=a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
	public static void mul(int a,int b){

		//乘法运算

		int c=a*b;
		System.out.println(a+" * "+b+" = "+c);
	}
	public static void div(int a,int b){

		//除法运算

		if(b==0){
			System.out.println("因为除数为0，所以无法计算！");
			return;
		}
		int c=a/b;
		System.out.println(a+" / "+b+" = "+c);
	}
}