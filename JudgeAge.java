public class JudgeAge
{
	public static void main(String []args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("�������������� �� ");
		int age=s.nextInt();
		if(age<=12){
			System.out.println("����һ����ͯ��");
		}
		else if(age<18){
			System.out.println("����һ�������꣡");
		}
		else if(age<30){
			System.out.println("����һ�����꣡");
		}
		else if(age<50){
			System.out.println("����һ��׳�꣡");
		}
		else{
			System.out.println("����һ�������ˣ�");
		}
	}
}