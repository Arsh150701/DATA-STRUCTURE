package list;
public class OrderedList<D> implements List<D>
{
	Integer buffer, size;
	Object arr[];
	public OrderedList()
	{
		buffer=5;
		size=0;
		arr=new Object[buffer];
	}

	public void add(D m)
	{
		Integer pos=-1;
		for (Integer i=0; i<size; i++)
		{
			if((Integer)m<(Integer)arr[i])
			{
				pos=i;
				break;
			}
		}
		if(pos!=-1)
		{
			for(Integer i=size; i>pos; i--)
			arr[i]=arr[i-1];
			
			arr[pos]=m;
			
		}
		else
		arr[size]=m;
		size++;
		if(size==buffer)
		{
			Object arr2[];
			arr2=new Object[buffer*2];
			buffer*=2;
			for(Integer i=0; i<size; i++)
			arr2[i]=arr[i];
			arr=arr2;
		}
	}

	public void traverse()
	{
		for(Integer i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public void remove(D m)
	{
		Integer pos=search(m);
		for(Integer i=pos;i<size;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
	}

	public Integer search(D m)
	{
		Integer hi,lo,mid;
		hi=size-1;
		lo=0;
		while(hi>lo)
		{
			mid=(hi+lo)/2;
			if((Integer)m==(Integer)arr[mid])
			return mid;
			else if((Integer)m>(Integer)arr[mid])
			lo=mid;
			else if((Integer)m<(Integer)arr[mid])
			hi=mid;
		}
		System.out.println("element not found");
		return -1;
	}
	public void checkIndex(Integer pos)
	{
		Integer size=getSize();
		if(pos<0||pos>size)
		{
			throw new IndexOutOfBoundsException("index = "+pos+"\nsize = "+size+"\n");
		}
		else System.out.println("index position found");
	}
	public Integer getSize()
	{
		return size;
	}
	public D get(Integer pos)
	{
		checkIndex(pos);
		return (D)arr[pos];
	}
}
