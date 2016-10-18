package threads;

import java.util.List;

public class MergeKSortedLinkedList {
	
	static class LinkedNode{
		int val;
		
		LinkedNode next;
		
		public LinkedNode(int val){
			this.val = val;
		}
	}
	
	public static LinkedNode mergeTwoSortedLinkedList(LinkedNode p1,LinkedNode p2){
		LinkedNode p = new LinkedNode(-1);
		
		while(p1 != null && p2 != null){
			if (p1.val >= p2.val){
				p.next = p1;
				p1 = p1.next;
			}else{
				p.next = p2;
				p2 = p2.next;
			}
		}
		
		if(p1 != null){
			p.next = p1;
			p1 = p1.next;
		}
		
		if(p2 != null){
			p.next = p2;
			p2 = p2.next;
		}
		
		return p.next;
	}
	
	public static LinkedNode mergeKSortedLinkedList(List<LinkedNode> list){
		if (list == null)
			return null;
		
		LinkedNode p1 = list.get(0);
		
		for(int i=1;i<list.size();i++){
			p1 = mergeTwoSortedLinkedList(p1, list.get(i));
		}
		
		return p1;
	}

	public static void main(String[] args) {
		
		

	}

}
