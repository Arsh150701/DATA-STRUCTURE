import java.util.Scanner;
import list.*;
class Driver<D>
{
	public static void main(String args[])
	{
		Object y;
		Integer z,a;
		boolean t=true,f=true;
		Scanner sc=new Scanner(System.in);
		LinearList<Object> ob=new LinearList<Object>();
		OrderedList<Integer> ob1=new OrderedList<Integer>();
		ArrayList<Object> ob2=new ArrayList<Object>();
		while(f==true)
		{
			System.out.println("\nPress 0 to break loop\nPress 1 for LinearList\nPress 2 for OrderedList\nPress 3 for ArrayList");
			Integer l=sc.nextInt();
			switch(l)
			{
				case 0:
				{
					f=false;
					break;
				}
				case 1:
				{
					System.out.println("\n\nLinearList\n");
					while(t==true)
				{
					System.out.println("\n\nPress 0 for traverse function\nPress 1 for add function\nPress 2 for add at pos function\nPress 3 for remove function\nPress 4 for checkIndex function\nPress 5 for getSize function\nPress 6 for reverse function\nPress 7 for search function\nPress 8 for get function\nPress 9 to break loop");
					Integer x=sc.nextInt();
					switch(x)
					{
						case 0:
							ob.traverse();
							break;
						case 1:
							System.out.println("enter element to be added");
							y=(Object)sc.next();
							ob.add(y);
							break;
						case 2:
							System.out.println("enter element to be added");
							y=(Object)sc.next();
							System.out.println("enter element position");
							z=sc.nextInt();
							ob.add(y,z);
							break;
						case 3:
							System.out.println("enter element position to be removed");
							z=sc.nextInt();
							ob.remove(z);
							break;
						case 4:
							System.out.println("enter element position to be checked");
							z=sc.nextInt();
							ob.checkIndex(z);
							break;
						case 5:
							System.out.println("size of list is "+ob.getSize());
							break;
						case 6:
							ob.reverse();
							System.out.print("The reversed string is ");
							ob.traverse();
							break;
						case 7:
							System.out.println("enter element to be searched");
							y=(Object)sc.next();
							System.out.println("Element found at index #"+ob.search(y));
							break;
						case 8:
							System.out.println("enter element number to get");
							z=sc.nextInt();
							System.out.println("element at index #"+z+" is "+ob.get(z));
							break;
						case 9:
							t=false;
							break;
						}
					}
					break;
				}
				case 2:
				{
					System.out.println("\n\nOrderedList\n");
					while(t==true)
				{
					System.out.println("\nPress 0 for traverse function\nPress 1 for add function\nPress 2 for remove function\nPress 3 for checkIndex function\nPress 4 for getSize function\nPress 5 for search function\nPress 6 for get function\nPress 7 to break loop");
					Integer x=sc.nextInt();
					switch(x)
					{
						case 0:
							ob1.traverse();
							break;
						case 1:
							System.out.println("enter element to be added");
							a=sc.nextInt();
							ob1.add(a);
							break;
						case 2:
							System.out.println("enter element position to be removed");
							z=sc.nextInt();
							ob1.remove(z);
							break;
						case 3:
							System.out.println("enter element position to be checked");
							z=sc.nextInt();
							ob1.checkIndex(z);
							break;
						case 4:
							System.out.println("size of list is "+ob1.getSize());
							break;
						case 5:
							System.out.println("enter element to be searched");
							a=sc.nextInt();
							System.out.println("Element found at index #"+ob1.search(a));
							break;
						case 6:
							System.out.println("enter element number to get");
							z=sc.nextInt();
							System.out.println("element at index #"+z+" is "+ob1.get(z));
							break;
						case 7:
							t=false;
							break;
						}
					}
					break;
				}
				case 3:
				{
					System.out.println("\n\nArrayList\n");
					while(t==true)
				{
					System.out.println("\nPress 0 for traverse function\nPress 1 for add function\nPress 2 for add at pos function\nPress 3 for remove function\nPress 4 for checkIndex function\nPress 5 for getSize function\nPress 6 for reverse function\nPress 7 for search function\nPress 8 for get function\nPress 9 to break loop");
					Integer x=sc.nextInt();
					switch(x)
					{
						case 0:
							ob2.traverse();
							break;
						case 1:
							System.out.println("enter element to be added");
							y=(Object)sc.next();
							ob2.add(y);
							break;
						case 2:
							System.out.println("enter element to be added");
							y=(Object)sc.next();
							System.out.println("enter element position");
							z=sc.nextInt();
							ob2.add(y,z);
							break;
						case 3:
							System.out.println("enter element position to be removed");
							z=sc.nextInt();
							ob2.remove(z);
							break;
						case 4:
							System.out.println("enter element position to be checked");
							z=sc.nextInt();
							ob2.checkIndex(z);
							break;
						case 5:
							System.out.println("size of list is "+ob2.getSize());
							break;
						case 6:
							ob2.reverse();
							System.out.print("The reversed string is ");
							ob2.traverse();
							break;
						case 7:
							System.out.println("enter element to be searched");
							y=(Object)sc.next();
							System.out.println("Element found at index #"+ob2.search(y));
							break;
						case 8:
							System.out.println("enter element number to get");
							z=sc.nextInt();
							System.out.println("element at index #"+z+" is "+ob2.get(z));
							break;
						case 9:
							t=false;
							break;
						}
				}
				break;
			}
		}
		}
}}
