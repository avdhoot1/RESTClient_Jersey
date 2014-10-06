package com.sample.rest;

public class link_li {
	
	Node start;
	Node end;
	int size;
	
	public link_li()
	{
		start=null;
		end=null;
		size=0;
	}
	
	
	public void add(int val)
	{
		Node ptr=new Node(val,null);
		size++;
		if(start==null)
		{
			start=ptr;
			end=start;
		}
		
		else
		{
			end.setNext(ptr);
			end=ptr;
		}
	}
	
	
	public void remove(int val)
	{
		Node i;
		Node temp;

		for(i=start;i.getData()!=val && i!=null;i=i.getNext());
		
		if(i==null)
		{
			System.out.println("Element not found !!");
		}
		else if(i==start)
		{
			start=start.getNext();
			size--;
		}
		else if(i==end)
		{
			for(temp=start; temp.getNext()!=i;temp=temp.getNext());
			end=temp;
			size--;
		}
		else
		{
			for(temp=start; temp.getNext()!=i;temp=temp.getNext());
			temp.setNext(i.getNext());
			size--;
		}
		
	}
	
	
	public void modify(int val,int val1)
	{
		Node i;
		try
		{
		for(i=start;i.getData()!=val && i!=null;i=i.getNext());
			i.setData(val1);
		}
		catch(NullPointerException e)
		{
			System.out.println("Element not found in the list !!");
		}
	}
	
	
	
	public void display()
	{
		Node temp=start;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.getData()+" -> ");
			temp=temp.getNext();
		}
		System.out.print("null\n\n");
	}
	

}
