import java.util.*;

public class LinkedListRemove{
	static class Node{
		Character key;
		int val;

		Node(Character key, int val){
			this.key = key;
			this.val = val;
		}
	}

	public static void main(String[] args){
		List<Node> list = new LinkedList<>();
		Map<Character, Node> cache = new HashMap<>();

		char key = 'a';
		for(int i=1; i<=5; i++){
			Node curr = new Node(key, i);
		       	list.add(curr);
			cache.put(key, curr);
			key +=1;
		}
		
		print(list);

		// delete node with key 'c'
		Node toDel = cache.get('c');
		list.remove(toDel);

		print(list);
	}

	private static void print(List<Node> list){
		// iterate LinkedList in java
		System.out.print("[");
		Iterator<Node> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next().key + ", ");
		}
		
		System.out.print("]");
		System.out.println();	
	}
}
