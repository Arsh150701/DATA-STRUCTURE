package stack;
public class StackAL implements Stack
{
	Integer size, buffer, pos;
	Object Stack[];
	public StackAL()
	{
		size=0;
		buffer=5;
		Stack=new Object[buffer];
	}
	
	public boolean empty()
	{
		if(size==0)
		return true;
		else return false;
	}
	
	public Object peek(Integer pos)
	{
		try
		{
			if(pos<0 || pos>size-1)
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
		return Stack[pos];
	}
	
	public void push(Object m)
	{
		Stack[size]=m;
		size++;
		if(size==buffer)
		{
			Object Stack2[];
			Stack2=new Object[buffer*2];
			buffer*=2;
			for(Integer i=0;i<size;i++)
			Stack2[i]=Stack[i];
			Stack=Stack2;
		}
	}
	
	public Object pop()
	{
		try
		{
			if(size<0)
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
		Object temp=Stack[size-1];
		size--;
		return temp;
	}
	public void traverse()
	{
		for(Integer i=0;i<size;i++)
		System.out.print(Stack[i]+" ");
		System.out.println();
	}
}
