public class fizzbuzz {
	/*
	Caclulate FizzBuzz
	1
	2
	Fizz
	4
	Buzz
	Fizz
	7
	8
	Fizz
	Buzz
	11
	Fizz
	13
	14
	FizzBuzz
	*/

	//public static void main(String[] args)
    //{
		//System.out.println(fizzbuzz(0, 0)[0] == "FizzBuzz");
		//System.out.println(fizzbuzz(0)[0]);
		//System.out.println(fizzbuzz(0,0)[0] == fizzbuzz(0)[0]);
		//System.out.print(fizzbuzz(0, 10)[0] + " " + fizzbuzz(0, 10)[1] + " " + fizzbuzz(0, 10)[2] + " " + fizzbuzz(0, 10)[3] + " " + fizzbuzz(0, 10)[4] + " " + fizzbuzz(0, 10)[5] + " " + fizzbuzz(0, 10)[6] + " " + fizzbuzz(0, 10)[7] + " " + fizzbuzz(0, 10)[8] + " " + fizzbuzz(0, 10)[9]);
    //}
	
	public static String[] fizzbuzz() {
		return fizzbuzz(1, 100);
	 }
	
	 public static String[] fizzbuzz(int n) {
		String fbValue[] = new String[1];
		if((n % 3) == 0 && (n % 5) == 0) {
			fbValue[0] = "FizzBuzz";
		}
		else if((n % 3) == 0) {
			fbValue[0] = "Fizz";
		}
		else if((n % 5) == 0) {
			fbValue[0] ="Buzz";
		}
		else {
			fbValue[0] = Integer.toString(n);
		}
		return fbValue;
	 }
	 
	 public static String[] fizzbuzz(int n, int m) {
		 String[] fbValues;
		 if(n == m) {
			 fbValues = new String[1];
			 fbValues[0] = fizzbuzz(n)[0];
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