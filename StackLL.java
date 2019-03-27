package stack;
public class StackLL implements Stack
{
	ListObject head, tail, temp;
	public StackLL()
	{
		tail=null;
		head=null;
	}
	
	public boolean empty()
	{
		if(head==null)
		return true;
		else
		return false;
	}
	
	public Object peek(Integer pos)
	{
		try
		{
			if(pos<0 || pos>getSize()-1)
			{
				BoundsException ob=new BoundsException();
				throw ob;
			}
		}
		catch(BoundsException x)
		{
			x.printError();
			return -1;
		}
		temp=head;
		for(Integer j=0;j<pos;j++)
		temp=temp.next;
		return temp.val;
	}
	
	public void push(Object m)
	{
		if (head==null)
		{
			ListObject obj=new ListObject(m);
			head=tail=obj;
		}
		else
		{
			ListObject obj=new ListObject(m);
			tail.next=obj;
			tail=obj;
		}
	}
	
	public Object pop()
	{
		Integer i=0;
		Object pop;
		try
		{
			if(head==null)
			{
				BoundsException ob=new BoundsException();
				throw ob;
			}
		}
		catch(BoundsException x)
		{
			x.printError();
			return null;
		}
		for(i=2, temp=head; i<getSize(); i++)
		temp=temp.next;
		pop=temp.next.val;
		temp.next=null;
		return pop;
		
	}
	
	public Integer getSize()
	{
		Integer j=0;
		for(ListObject i=head; i!=null; i=i.next)
		++j;
		return j;
	}
	
	public void traverse()
	{
		for(ListObject i=head; i!=null; i=i.next)
		System.out.print(i.val+" ");
		System.out.println();
	}
}
