import java.util.*;
class Node{
	int data;
	Node next;
	public Node(int d){
		data=d;
		next=null;
		}
	}
class Link_list {
	Node head=null;;
	Scanner sc=new Scanner(System.in);
	public void create_node() {
		System.out.println("Do you want to create the node?(1/0)");
		int ch;
		ch=sc.nextInt();
		while(ch==1)
		{
			int data=sc.nextInt();
			Node link1=new Node(data);
			Node p;
			if(head==null)
			{
				head=link1;
			}
			else
			{
				p=head;
				while(p.next!=null)
				{
					p=p.next;
				
				}
				p.next=link1;
			}
			System.out.println("Do you want to create the node?(1/0)");
			ch=sc.nextInt();
		}
	}
	public void Insert_beg() {
		int data=sc.nextInt();
		Node link1=new Node(data);
		if(head==null)
		{
			head=link1;
		}
		else
		{
			link1.next=head;
			head=link1;
		}
		
	}
	public void Insert_any(int pos) {
		if(pos==1)
		{
			Insert_beg();
		}
		else if(pos==length()+1)
		{
			Insert_end();
		}
		else {
			int data=sc.nextInt();
			Node link1=new Node(data);
			Node p=head;
			int ctr=1;
			while(ctr<pos-1)
			{
				p=p.next;
				ctr++;
			}
			link1.next=p.next;
			p.next=link1;
			
		}
	}
	public void Insert_end() {
		Node p=head;
		int data=sc.nextInt();
		Node link1=new Node(data);
		if(head==null)
		{
			head=link1;
		}
		else {
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=link1;
		}
		
		
	}
	public void Delete_beg() {
		if(head==null)
		{
			return;
		}
		else
		{
			head=head.next;
		}
		
	}
	public void Delete_any(int pos) {
		if(pos==1)
		{
			Delete_beg();
		}
		else if(pos==length())
		{
			Delete_end();
		}
		else
		{
			int ctr=1;
			Node f=head;
			Node b=head;
			while(ctr<pos)
			{
				b=f;
				f=f.next;
				ctr++;
			}
			b.next=f.next;
			
		}
		
		
	}
	public void Delete_end() {
		Node f=head;
		Node b=head;
		while(f.next!=null)
		{
			b=f;
			f=f.next;
		}
		b.next=null;
		
	}
	public int  length() {
		Node p=head;
		int count=0;
		while(p!=null)
		{
			p=p.next;
			count++;
		}
		return count;
	}
	public void display() {
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println(" ");
	}
	
	
}
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_list obj=new Link_list();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the choice: ");
		System.out.println("1.Create Node");
		System.out.println("2.Insert at begining");
		System.out.println("3.Insert at any position");
		System.out.println("4.Insert at end");
		System.out.println("5.Delete at begining");
		System.out.println("6.Delete at any position");
		System.out.println("7.Delete at end");
		System.out.println("8.Display list");

		int ch;
		ch=sc.nextInt();
		while(ch!=0)
		{
			switch(ch)
			{
			case 1:obj.create_node();
			 	break;
			case 2:obj.Insert_beg();
				break;
			case 3:System.out.println("Enter the position");
					int p=sc.nextInt();
				obj.Insert_any(p);
				 break;
			case 4:obj.Insert_end();
				break;
			case 5:obj.Delete_beg();
				break;
			case 6:System.out.println("Enter the position");
					int q=sc.nextInt();
				obj.Delete_any(q);
				break;
			case 7:obj.Delete_end();
				break;
			case 8:obj.display();
				break;
			}
			System.out.println("\nEnter the choice: ");
			System.out.println("1.Create Node");
			System.out.println("2.Insert at begining");
			System.out.println("3.Insert at any position");
			System.out.println("4.Insert at end");
			System.out.println("5.Delete at begining");
			System.out.println("6.Delete at any position");
			System.out.println("7.Delete at end");
			System.out.println("8.Display list");
			ch=sc.nextInt();
			
		}
	}

}
