
using System;

namespace Algorithms
{
	public class ReverseLinkedList
	{
		public ListNode Reverse(ListNode node)
		{
			if(node==null || node.next==null){
				return node;
			}
			ListNode pre=null, p=node,q=node.next;
			while(p!=null){
				p.next=pre;
				pre = p;
				p=q;
				if(q!=null)
					q=q.next;
			}
			return pre;
		}

		public static void Demo(){
			ReverseLinkedList sol = new ReverseLinkedList();
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
			ListNode p = head;
			Console.WriteLine("Before reversing:");
			while(p!=null){
				Console.Write(p.val.ToString() + "->");
				p = p.next;
			}
            ListNode reverse = sol.Reverse(head);
			Console.WriteLine("\nAfter reversing:");
            while(reverse!=null){
                Console.Write(reverse.val.ToString() + "->");
				reverse=reverse.next;
            } 
		}
	}
}
