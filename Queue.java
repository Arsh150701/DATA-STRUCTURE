package queue;
public interface Queue
{
	public boolean empty();
	public Object peek(Integer pos);
	public void push(Object m);
	public Object pop();	
}
