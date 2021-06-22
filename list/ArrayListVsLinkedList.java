//import ja
import java.util.*;

public class ArrayListVsLinkedList {
	public static void main(String[] args){
		String[] arr = new String[] {"first", "sec", "third"};

		List<String> strings = Arrays.asList(arr);

		int len = strings.size();

		System.out.println("Initial length of List: " + len);

		String str = strings.get(0);
		len = strings.size();

		System.out.println("Length of list after getting 1st element: " + len);
	}
}
