package net.cloudcentrik;

public class Utils {

	// find duplicate from array
	public static boolean isDuplicates(int n[]) {
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					return true;
				}
			}
		}
		return false;
	}
	

	// variable-length argument
	public static void testVariableLengthArgument(int... n) {

		for (int i : n) {
			System.out.println(i);
		}

	}

}
