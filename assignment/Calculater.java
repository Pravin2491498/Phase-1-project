package assignment;
import java.util.Scanner;
public class Calculater 
{
	public static void main(String [] args)
	{
		double Answer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numers");
		int firstnumber=sc.nextInt();
		int secondnumber=sc.nextInt();
		System.out.println("Enter the operator");
		char operator=sc.next().charAt(0);
		double Ans=0;
		switch(operator)
		{
		case '+':
			Ans=firstnumber+secondnumber;
			break;
		case '-':
			Ans=firstnumber-secondnumber;
		break;
		case '*':
			Ans=firstnumber*secondnumber;
		break;
		case '/':
			Ans=firstnumber/secondnumber;
		break;
		}
		System.out.println("The answer is"+Ans);
	}

}
