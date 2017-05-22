//노드 클래스 정의
class ListNode{
	private String data;
	public ListNode link;
	//overloading..polymorphism
	public ListNode(){
		this.data = null;
		this.link = null;
	}
	public ListNode(String data){
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link){
		this.data = data;
		this.link = link;
	}
	public String getData(){
		return this.data;
	}
}

class LinkedList{
	private ListNode head;
	//초기화
	public LinkedList(){
		head = null;
	}
	public void insertMiddleNode(ListNode pre, String data){
		ListNode newNode = new ListNode(data);
		if(head==null){
			this.head = newNode;
		}
		else{
			newNode.link = pre.link;
			pre.link = newNode;
		}
		
	}
	public void insertLastNode(String data){
		ListNode newNode = new ListNode(data);
		if(head == null){
			this.head = newNode;
		}
		else{
			ListNode temp =head;
			while(temp.link != null) temp = temp.link;
			temp.link = newNode;
		}
	}
	
	public void deleteLastNode(){
		ListNode pre, temp;
		//아무것도 없을 때
		if(head==null) return;
		//마지막 노드일 때
		if(head.link == null){
			head=null;
		}
		else{
			//로직이 잘 이해가지 않음
			pre = head;
			temp = head.link;
			while(temp.link != null){
				pre=temp;
				temp=temp.link;
				
			}
			pre.link=null;
		}
	}
	public ListNode searchNode(String data){
		ListNode temp = this.head;
		while(temp!=null){
			if(data == temp.getData())
				return temp;
			else temp = temp.link;
		}
		return temp;
	}
	public void reverseList(){
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while(next!=null){
			pre = current;
			current=next;
			next=next.link;
			current.link=pre;
		}
		head=current;
	}
	public void printList(){
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp!=null){
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp!=null){
				System.out.printf(",  ");
			}
		}
		System.out.println(")");
	}
}


public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		ListNode pre = L.searchNode("수");
		if(pre==null)
			System.out.println("검색실패 >> 찾는 데이터가 없습니다.");
		else{
			L.insertMiddleNode(pre,"금");
			L.printList();
		}
		
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();
		
		System.out.println("(4) 리스트의 마지막 노드 삭제하기");
		L.deleteLastNode();
		L.printList();
	}

}

