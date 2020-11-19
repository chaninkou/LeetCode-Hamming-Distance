package leetcode461;

public class Main {
	public static void main(String[] args) {
		int x = 3;
		
		int y = 8;
		
		System.out.println("x: " + x + " y: " + y);
		
		FindBitsDifferences solution = new FindBitsDifferences();
		
		System.out.println("solution: " + solution.hammingDistance(x, y));
	}
}
