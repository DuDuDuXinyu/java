public class JudgeAge
{
	public static void main(String []args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("请输入您的年龄 ： ");
		int age=s.nextInt();
		if(age<=12){
			System.out.println("您是一个儿童！");
		}
		else if(age<18){
			System.out.println("您是一个青少年！");
		}
		else if(age<30){
			System.out.println("您是一个青年！");
		}
		else if(age<50){
			System.out.println("您是一个壮年！");
		}
		else{
			System.out.println("您是一个老年人！");
		}
	}
}