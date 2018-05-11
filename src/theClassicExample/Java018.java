package theClassicExample;

public class Java018 {
	public static void main(String[] srgs) {
		
		String[] yi= {"x","y","z"};
		@SuppressWarnings("unused")
		String a,b,c;
	
		for(int j=0;j<=2;j++) {
			a=yi[j];
			for(int q=0;q<=2;q++) {
				if(q==j)continue;
				b=yi[q];
				for(int k=0;k<=2;k++) {
					if(k==j||k==q)continue;
					c=yi[k];
				if(a==yi[0]||c==yi[0]||c==yi[2])continue;
				      System.out.println("a和"+yi[j]+"比;b和"+yi[q]+"比;c和"+yi[k]+"比。");
			
		}}
}
}}