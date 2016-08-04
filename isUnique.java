import java.util.*;

class isUnique {
	//Solution 1: HashSet 
	//Space O(N) Time O(N)
	/*public boolean isUnique(String str) {
		if(str.length() == 0) return true;
		HashSet<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if(set.contains(c)) return false;
			else set.add(c);
		}
		return true;
	}*/

	//Solution 2: Arrays
	//Space O(1) Time O(N)
	public boolean isUnique(String str) {
		if (str.length() == 0) return true;
		else if (str.length() > 256) return false;
		boolean[] b = new boolean[256];
		for(char c : str.toCharArray()) {
			if(b[c]) return false;
			else b[c] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		isUnique i = new isUnique();
		if (i.isUnique(args[0])) {
			System.out.println("The String is unique!!");
		}else {
			System.out.println("Not Unique!!!!");
		}

	}
}