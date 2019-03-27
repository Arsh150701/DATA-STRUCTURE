import java.util.Scanner;
import tree.*;
public class DriverBST
{
	public static void main(String args[])
	{
		BST bst=new BST();
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		Integer x,y;
		while(t==true)
		{
			System.out.println("\n\nEnter 0 to break loop\nEnter 1 for insert function\nEnter 2 for search function\nEnter 3 for delete function\nEnter 4 for In-order traversal\nEnter 5 for Pre-order traversal\nEnter 6 for post-order traversal");
			x=sc.nextInt();
			
			switch(x)
			{
				case 0:
				t=false;
				break;
				
				case 1:
				System.out.println("Enter element to be added");
				y=sc.nextInt();
				bst.insert(y);
				break;
				
				case 2:
				System.out.println("Enter element to be searched");
				y=sc.nextInt();
				System.out.println("Element found at "+bst.search(bst.getRoot(), y));
				break;
				
				case 3:
				System.out.println("Enter element to be deleted");
				y=sc.nextInt();
				bst.delete(y);
				break;
				
				case 4:
				bst.IOT(bst.getRoot());
				System.out.println();
				break;
				
				case 5:
				bst.preOT(bst.getRoot());
				System.out.println();
				break;
				
				case 6:
				bst.postOT(bst.getRoot());
				System.out.println();
				break;
				
			}
		}
	}
}
