public class fizzbuzz {
	
	public static String[] fizzbuzz() {
		return fizzbuzz(1, 100);
	 }
	
	 public static String[] fizzbuzz(int n) {
		String fbValue[] = {""};
		if((n % 3) == 0) {
			fbValue[0] = "Fizz";
		}
		if((n % 5) == 0) {
			fbValue[0] += "Buzz";
		}
		else {
			fbValue[0] = Integer.toString(n);
		}
		return fbValue;
	 }
	 
	 public static String[] fizzbuzz(int n, int m) {
		 String[] fbValues;
		 if(n == m) {
			 return fizzbuzz(n);
		 }
		 else {
			 fbValues = new String[m - n];
			 for(int i = n; i < m; i++) {
				fbValues[i - n] = fizzbuzz(i)[0];
			}
		 }
		 return fbValues;
	 }
}