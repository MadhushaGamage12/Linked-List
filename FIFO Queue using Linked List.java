package linkedList;

	import java.util.*;

	public class LLQueue
	{
		class Node
		{
			public int data;
			public Node next;
		}

		private Node first;

		public LLQueue()
		{
			first = null;
		}

		public void insertFirst(int x)
		{
			Node n = new Node();
			n.data = x;
			n.next = first;
			first = n;
		}

		public void enqueue(int x)
		{
			if (first == null)
			{
				insertFirst(x);
			}
			else
			{
				Node n = new Node();
				n.data = x;
				Node temp = first;
				while (temp.next != null)
					temp = temp.next;
				n.next = temp.next;
				temp.next = n;
			}
		}

		public int dequeue()
		{
			if (first == null)
			{
				throw new NoSuchElementException();
			}
			else
			{
				int ret = first.data;
				first = first.next;
				return ret;
			}
		}

		public int peek()
		{
			if (first == null)
			{
				throw new NoSuchElementException();
			}
			else
			{
				return first.data;
			}
		}

		public static void main (String[] args)
		{
			LLQueue queue = new LLQueue();
			queue.enqueue(108);
			queue.enqueue(52);
			queue.enqueue(83);

			System.out.print("First peek: " + queue.peek());

			System.out.print("\nFirst dequeue: " + queue.dequeue() + "\nSecond dequeue: " + queue.dequeue() + "\nThird dequeue: " + queue.dequeue());
		}
	
}

