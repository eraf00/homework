package lang;

public class lang5 {
	public static void main(String[] args) {
		String a = "I OK OK best OK";
		System.out.println("»»Ç°µÄ×Ö·û´®£º" + a);
		int begin = 0, end = a.length();
		System.out.print("Î»ÖÃ£º");
		for (int i = 0; i < a.length(); i++) {
			String b = a.substring(begin, end);
			if (b.lastIndexOf("OK") != -1) {
				end = b.lastIndexOf("OK") - 1;
				System.out.print(b.lastIndexOf("OK") + "   ");
			}
		}
		System.out.println("");
		String c = a.replace("OK", "hello");
		System.out.println("»»ºóµÄ×Ö·û´®£º" + c);
	}
}
