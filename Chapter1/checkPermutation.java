class checkPermutation {
	public boolean checkPermutation(String one, String two) {
		if(one.length() != two.length()) return false;
		//HashMap<Character, Integer> map = new HashMap<>();
		int[] c = new int[26];
		for (char o : one.toCharArray()) {
			c[o - 'a']++;
		}
		for (char t : two.toCharArray()) {
			c[t - 'a']--;
		}

		for (int tmp : c) {
			if(tmp != 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		checkPermutation check = new checkPermutation();
		if (check.checkPermutation(args[0], args[1])) {
			System.out.println("Checked~!");
		} else {
			System.out.println("Wrong Wrong Wrong");
		}
	}
}