package queue;
public class QueueAL implements Queue
{
	Integer size, buffer, pos;
	Object Queue[];
	public QueueAL()
	{
		size=0;
		buffer=5;
		Queue=new Object[buffer];
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
		else
		return Queue[pos];
	}
	
	public void push(Object m)
	{
		if(size==buffer)
		{
			Object Queue2[];
			Queue2=new Object[buffer*2];
			buffer*=2;
			for(Integer i=0;i<size;i++)
			Queue2[i]=Queue[i];
			Queue=Queue2;
		}
		Queue[size]=m;
		size++;
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
		Object temp=Queue[0];
		for(Integer i=1;i<size-2;i--)
		Queue[i-1]=Queue[i];
		size--;
		return temp;
	}
	public void traverse()
	{
		for(Integer i=0;i<size;i++)
		System.out.print(Queue[i]+" ");
		System.out.println();
	}
}
