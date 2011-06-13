public class p027 {
	
	public static void main(String[] args) {
		int bestNum = -1;
		int bestA = -1;
		int bestB = -1;
		for (int a = -1000; a <= 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int num = numberOfConsecutivePrimesGenerated(a, b);
				if (bestNum == -1 || num > bestNum) {
					bestNum = num;
					bestA = a;
					bestB = b;
				}
			}
		}
		System.out.println(bestA * bestB);
	}
	
	
	private static int numberOfConsecutivePrimesGenerated(int a, int b) {
		int i = 0;
		while (Library.isPrime(i * i + i * a + b))
			i++;
		return i;
	}
	
}