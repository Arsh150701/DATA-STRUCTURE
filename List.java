package list;
public interface List<D>
{
	public void add(D v);
	public void traverse();
	//public void add(D v, Integer pos);
	//public void remove(Integer pos);
	public void checkIndex(Integer pos);
	public Integer getSize();
	//public void reverse();
	public Integer search(D v);
	public D get(Integer pos);
}
