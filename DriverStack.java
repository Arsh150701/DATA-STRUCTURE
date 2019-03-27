import java.util.Scanner;
import stack.StackAL;
import stack.StackLL;
class DriverStack
{
	public static void main(String args[])
	{
		boolean t=true,f=true;
		Object y;
		Integer z;
		Scanner sc=new Scanner(System.in);
		StackAL obj=new StackAL();
		StackLL obj1=new StackLL();
		while(f=true)
		{
		System.out.println("\n\nPress 0 to break loop\nPress 1 for StackAL\nPress 2 for StackLL");
		sc.nextLine();
		Integer x=sc.nextInt();
		switch(x)
		{
		case 0:
		f=false;
		break;
		case 1:
		while(t==true)
		{
			System.out.println("\n\nPress 0 to break loop\nPress 1 for empty function\nPress 2 for push function\nPress 3 for pop function\nPress 4 for peek function\nPress 5 for traverse function");
			x=sc.nextInt();
			switch(x)
			{
				case 0:
					t=false;
					break;
				case 1:
					if(obj.empty()==true)
					System.out.println("Stack is empty");
					else System.out.println("Stack is not empty");
					break;
				case 2:
					System.out.println("enter element to be added");
					y=(Object)sc.next();
					obj.push(y);
					break;
				case 3:
					System.out.println("removed element is "+obj.pop());
					break;
				case 4:
					System.out.println("enter index number to peek");
					z=sc.nextInt();
					System.out.println("element is "+obj.peek(z));
					break;
				case 5:
					obj.traverse();
					break;
			}
		}
		break;
		case 2:
		while(t==true)
		{
			System.out.println("\n\nPress 0 to break loop\nPress 1 for empty function\nPress 2 for push function\nPress 3 for pop function\nPress 4 for peek function\nPress 5 for traverse function");
			x=sc.nextInt();
			switch(x)
			{
				case 0:
					t=false;
					break;
				case 1:
					if(obj1.empty()==true)
					System.out.println("Stack is empty");
					else System.out.println("Stack is not empty");
					break;
				case 2:
					System.out.println("enter element to be added");
					y=(Object)sc.next();
					obj1.push(y);
					break;
				case 3:
					System.out.println("removed element is "+obj1.pop());
					break;
				case 4:
					System.out.println("enter index number to peek");
					z=sc.nextInt();
					System.out.println("element is "+obj1.peek(z));
					break;
				case 5:
					obj1.traverse();
					break;
			}
		}
		break;
		}}
	}
}
