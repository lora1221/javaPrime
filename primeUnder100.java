package javaPrime;

public class primeUnder100 {
    public static void main(String[] args) {
        System.out.println("List of prime number under 100: ");
        for (int i = 0; i < 100; i ++) {
            boolean result = isPrime(i);
            if (result) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        double sqr = Math.sqrt(n);
        if ((n != 2 && n % 2 == 0) || (n != 5 && n % 5 == 0)){
            prime = false;
        } else {
            for (int i = 3; i <= sqr; i ++) {
                if (n % i == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
}
