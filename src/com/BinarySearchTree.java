package com;

public class BinarySearchTree {
	private TreeNode root;
	
	public void insert(int data){
		if(root!=null)
			root.insert(data);
		else
			this.root=new TreeNode(data);
	}
	
	/*public void delete(int data){
		boolean isLeftChild=false;
		TreeNode current=this.root;
		TreeNode parent=this.root;
		if(current==null)
			return;
		while(current!=null && current.getData()!=data){
			parent=current;
			if(data<current.getData()){
				current=current.getLeftChild();
				isLeftChild=true;
			}else{
				current=current.getRightChild();
				isLeftChild=false;
			}
			if(current==null)
				return;
		}
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(current==root)
				root=null;
			else{
				if(isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
					
			}
		}
	}
	*/
	public void delete(int data){
		TreeNode toDel=find(data);
		toDel.delete();
	}
	
	public TreeNode find(int data){
		if(root!=null)
			return root.find(data);
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
