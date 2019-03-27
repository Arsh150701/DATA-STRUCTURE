package list;
public class ArrayList<D> implements List<D>
{
	Integer buffer;
	Integer size;
	Object arr[];
	public ArrayList()
	{
		buffer = 5;
		size = 0;
		arr=new Object[buffer];
	}
	
	public void add(D i)
	{
		arr[size]=i;
		size++;
		if(size == buffer)
		{
			Object arr2[]=new Object[buffer*2];
			buffer*=2;
			for (Integer d=0;d<size;d++)
			{
				arr2[d]=arr[d];
			}
			arr=arr2;
		}
	}
	
	public void traverse()
	{
		for(Integer j=0;j<size;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	
	public void add(D m,Integer pos)
	{
		for(Integer i=size;i>pos;i--)
		arr[i]=arr[i-1];
		
		arr[pos]=m;
		size++;
	}
	
	public void remove(D m)
	{
		Integer pos=search(m);
		for(Integer i=pos;i<size;i++)
		arr[i]=arr[i+1];
		
		size--;
	}
	
	public Integer search(D m)
	{
		for(Integer i=0;i<size;i++)
		{
			if(arr[i]==m)
			return i;
		}
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
	public void reverse()
	{
		Object arr3[]=new Object[buffer];
		for(Integer i=0,j=size;i<size;i++,j--)
			arr3[i]=arr[j];
		arr=arr3;
	}
	public D get(Integer pos)
	{
		checkIndex(pos);
		return (D)arr[pos];
	}
}
