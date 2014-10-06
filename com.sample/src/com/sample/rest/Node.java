package com.sample.rest;


public class Node {
	
		private int data;
		private Node next;
		
		public Node(int val,Node n)
		{
			data=val;
			next=n;
		}
		
		public Node()
		{
			data=0;
			next=null;
		}
		
		public int getData()
		{
			return data;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setData(int val)
		{
			data=val;
		}
		
		public void setNext(Node n)
		{
			next=n;
		}
		
	
}
