public class TimeDown
{
	public static void main(String []args){
		System.out.print("�����뵹��ʱ��ʱ�䣨����Ϊ��λ���� ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int num=s.nextInt();
		int a=num;
		while(num!=0){
			//����һ��
			//System.out.print(num+"\r");
			//��������
			System.out.print(num);
			System.out.print("\r");
			num--;

			//�߳��ն�Ҳ����˯��
			//�̶���ʽ

			try {
                 Thread.sleep(1000);
 
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }


		}
		System.out.print(a+"sʱ���Ѿ����ˣ�");
	}
}