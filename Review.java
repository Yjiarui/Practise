//设定x 将小于x的数排在大于或等于x之前

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val = val;
	}
}
public class Review{
public static ListNode partition(ListNode head, int x){
	ListNode small = null;
	ListNode cur = head;
	ListNode big = null;
	ListNode last1 = null;
	ListNode last2 = null;
	for(cur = head;cur != null;cur = cur.next){
		if(cur.val < x){
			//把cur尾插到small里
			if(small == null){
				small = cur;
			}else{
				last1.next = cur;
			}
			last1 = cur;
		}else{
			//把cur尾插到big里
			if(big == null){
				big = cur;
			}else{
				last2.next = cur;
			}
			last2 = cur;
		}
	}
	if(last1 == null){
			return big;
		}else{
			//把big尾插到small
			last1.next = big;
		}
	if(last2 == null){
			return small;
		}else{
			last2.next = null;
		}
	return small;
}
		private static ListNode creatList(){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(9);
		ListNode n4 = new ListNode(7);
		ListNode n5 = new ListNode(2);
		ListNode n6 = new ListNode(3);
		ListNode n7 = new ListNode(1);
		ListNode n8 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		return n1;
	}
      public static void main(String[] args){
		ListNode head = creatList();
		ListNode rhead = partition(head,4);
		
		for(ListNode cur = rhead;cur !=null;cur=cur.next){
			System.out.printf("(%d)-->",cur.val);
		}
	}
}