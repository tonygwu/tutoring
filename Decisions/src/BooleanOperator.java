
public class BooleanOperator {
	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		if (i < 4 || j++ >= 6) {
			System.out.println("Hey there!");
		}
		System.out.println("Second statement, j is: " + j);
	}
}
