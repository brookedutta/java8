import java.util.*;

public class GetLinkedListFromArray{ 
	public static void main(String[] args){
		String[] arrString = new String[] {"ab", "cd", "ef"};
		List<String> listString = new LinkedList<>(Arrays.asList(arrString));
		
		//Following does not as Arrays.asList(...) returns instance of "AbstractList"
		//In AbstractList, "add(index, element)" is a UNSUPPORTED OPERATION, 
		//meaning not every JVM will implement it and CAN throw Unsupported Operation exception.  
		//List<String> listString = Arrays.asList(arrString);
		
		listString.add(0, "addFront");

		int size = 1; 
		for(String str : listString){
			if (size == 1) {
				System.out.print("[" + str + ", ");
			} else if (size == listString.size()) {
				System.out.print(str + "]");
				System.out.println();
			} else {
				System.out.print(str + ", ");
			}

			size +=1;
		}
	}
}
