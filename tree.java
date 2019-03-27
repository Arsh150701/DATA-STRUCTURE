package tree;
public interface tree
{
	public void insert(Integer v);
	public void delete(Integer v);
	public BSTNode search(BSTNode print, Integer x);
	public void IOT(BSTNode root);
	public void preOT(BSTNode root);
	public void postOT(BSTNode root);
}
