package tree;
public class BST implements tree
{
	static BSTNode root,hop,temp,print;
	public BST()
	{
		root=null;
	}
	
	public void insert(Integer v)
	{
		BSTNode ob=new BSTNode(v);
		
		if(root==null)
		{
			root=ob;
			print=root;
		}
		
		else
		{
			hop=root;
			while(true)
			{
			if(ob.val<=hop.val)
				{
					if(hop.left==null)
					break;
					hop=hop.left;
				}
				else
				{
					if(hop.right==null)
					break;
					hop=hop.right;
				}
			}
		if(ob.val<=hop.val)
		hop.left=ob;
		else
		hop.right=ob;
		}
	}
	
	public void IOT(BSTNode print)
	{
		if(print!=null)
		{
			IOT(print.left);
			System.out.print(print.val+" ");
			IOT(print.right);
		}
	}

	public void preOT(BSTNode print)
	{
		if(print!=null)
		{
			System.out.print(print.val+" ");
			preOT(print.left);
			preOT(print.right);
		}
	}
	
	public void postOT(BSTNode print)
	{
		if(print!=null)
		{
			postOT(print.left);
			postOT(print.right);
			System.out.print(print.val+" ");
		}
	}
	
	public BSTNode getRoot()
	{
		return root;
	}
		
	public BSTNode search(BSTNode print, Integer x)
	{
		if (print==null || print.val==x) 
        return print;

		if (print.val>=x)
		return search(print.left, x);

		return search(print.right, x);
	}
	
	public void delete(Integer v)
	{
		temp=null;
		if(search(print, v)==null)
		{
			System.out.println("element to be deleted not found!!");
			return;
		}
		else
		temp=search(print, v);
		
		//to obtain parent
		BSTNode parent=null;
		hop=root;
		while(true)
		{
			//System.out.println(hop.val+"\n"+hop);
			if(hop.left==temp || hop.right==temp)
			{
				parent=hop;	
				break;
			}
			else if(v<hop.val)
			hop=hop.left;
			else if(v>hop.val)
			hop=hop.right;
		}
		
		//0CN
		if(temp.right==null && temp.right==null)
		{
			if(temp.val<=parent.val)
			parent.left=null;
			else
			parent.right=null;
		}
		//1CN
		else if(temp.left==null)
		{
			if(temp.val<=parent.val)
			parent.left=parent.left.right;
			else
			parent.right=parent.right.right;
		}
		else if(temp.right==null)
		{
			if(temp.val<=parent.val)
			parent.left=parent.left.left;
			else
			parent.right=parent.right.left;
		}
		//2CN
		else if(temp.left!=null && temp.right!=null)
		{
			if(parent==null)
			{
				temp=root;
				while(temp.right!=null)
				{
					temp.val=temp.right.val;
					temp=temp.right;
				}
				temp=null;
			}
			if(temp.val<=parent.val)
			{
				parent.left.val=parent.left.right.val;
				hop=parent.left.right;
			}
			else
			{
				parent.right.val=parent.right.right.val;
				hop=parent.right.right;
			}
			
			while(hop.right.right!=null)
			{
				hop.val=hop.right.val;
				hop=hop.right;
			}
			hop.val=hop.right.val;
			hop.right=null;
		}
	}
}
