import java.util.*;
public class switch1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int week;
	System.out.println("Enter the value between 1-7");
	week=sc.nextInt();
	switch(week)
		{
		case 1:
			System.out.println("Sunday");
		break;
		case 2:
			System.out.println("Monday");
		break;
		case 3:
			System.out.println("Tuesday");
		break;
		case 4:
			System.out.println("Wednesday");
		break;
		case 5:
			System.out.println("Thursday");
		break;
		case 6:
			System.out.println("Friday");
		break;
		case 7:
			System.out.println("Saturday");
		break;
			default:
				System.out.println("the value Must be  between 1 to 7");

		}
	}
}