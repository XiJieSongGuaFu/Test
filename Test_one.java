package test_One;
import java.util.Scanner;

public class Test_one {
	public static void main(String[] args)
	{
		System.out.println("�����ܼ�\n");
		Scanner input=new Scanner(System.in);
		int Days=input.nextInt();
		System.out.println("�¶ȶ���\n");
		int Temperature=input.nextInt();
		if(Days==6&&Days==7){
			if(Temperature>=30){
				System.out.println("��Ӿ");
			}
			else{
				System.out.println("˯��");
			}
		}
		else {
			if(Temperature>=30){
				System.out.println("˯��");
			}
			else {
				System.out.println("����");
			}
		}
	}

}
