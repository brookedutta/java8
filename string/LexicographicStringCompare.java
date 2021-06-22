public class LexicographicStringCompare {
	public static void main(String[] args){
		String first = "apple";
		String sec = "application";

		int val = first.compareTo(sec);
		System.out.println(first + " compareTo " + sec + ": " + val);

		val = sec.compareTo(first);
		System.out.println(sec + " compareTo " + first + ": " + val);
	}
}
