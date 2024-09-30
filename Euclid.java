
class Euclid {
	public static int gcd(int a, int b) {
		if(b==0)
			return a;

		return gcd(b, a%b);
	}

	public static void main(String [] arg) {
		int a= 60,b= 36;

		System.out.print(gcd(a, b));
	}
}