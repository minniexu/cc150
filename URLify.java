import java.util.*;
class URLify {
	public String URLify(String input) {
		String[] str = input.trim().split(" ");
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			if (str[i] != " ") {
				res.append(str[i]);
				if (i != str.length - 1) {
					res.append("%20");
				}
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		URLify url = new URLify();
		System.out.println("Result is : " + url.URLify(args[0]));
	}
}