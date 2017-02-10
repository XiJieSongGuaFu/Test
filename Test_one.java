package test_One;
import java.util.Scanner;

public class Test_one {
	public static void main(String[] args)
	{
		System.out.println("输入周几\n");
		Scanner input=new Scanner(System.in);
		int Days=input.nextInt();
		System.out.println("温度多少\n");
		int Temperature=input.nextInt();
		if(Days==6&&Days==7){
			if(Temperature>=30){
				System.out.println("游泳");
			}
			else{
				System.out.println("睡觉");
			}
		}
		else {
			if(Temperature>=30){
				System.out.println("睡觉");
			}
			else {
				System.out.println("工作");
			}
		}
	}

}
