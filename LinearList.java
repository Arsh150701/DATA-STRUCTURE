package list;
public class LinearList<D> implements List<D>
{
	ListObject<D> head, tail, temp;
	Integer j=0;
	public LinearList()
	{
		tail=null;
		head=null;
	}
	public void add(D v)
	{
		if(head==null)
		{
			ListObject<D> obj=new ListObject<D>(v);
			head=tail=obj;
		}
		else
		{
			ListObject<D> obj=new ListObject<D>(v);
			tail.next=obj;
			tail=obj;			
		}
	}
	public void traverse()
	{
		for(ListObject<D> i=head; i!=null; i=i.next)
		{
			System.out.print(i.val+" ");
		}
		System.out.println();
	}
	public void add(D v, Integer pos)
	{
		if(pos==0)
		{
			ListObject<D> newNode=new ListObject<D>(v);
			newNode.next=head;
			head=newNode;
		}
		else
		{
			ListObject<D> temp=head;
			for(j=0;j<pos-1;j++)
			temp=temp.next;
	
			ListObject<D> addNode=new ListObject<D>(v);
			addNode.next=temp.next;
			temp.next=addNode;
		}
	}
	public void remove(Integer pos)
	{
		checkIndex(pos);
		if(pos==0)
		head=head.next;
		else
		{
			j=1;
			for(temp=head; j<pos;j++)
			temp=temp.next;
			temp.next = temp.next.next;
		}
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
		j=0;
		for(ListObject<D> i=head; i!=null; i=i.next)
		++j;
		return j;
	}
	public void reverse()
	{
		Object arr[]=new Object[getSize()];
		j=0;
		for(ListObject<D> i=head; i!=null; i=i.next,j++)
			arr[j]=i.val;
		--j;
		for(ListObject<D> i=head; i!=null; i=i.next,j--)
			i.val=(D)arr[j];
	}
	public D get(Integer pos)
	{
		checkIndex(pos);
		temp=head;
		for(j=0;j<pos;j++)
		temp=temp.next;
		return temp.val;
	}
	public Integer search(D v)
	{
		j=0;
		for(ListObject<D> i=head; i!=null; i=i.next)
		{
			if(i.val.equals(v))
			return j;
			j++;
		}
		return -1;
	}
}
