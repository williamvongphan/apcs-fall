public class Main {
    public static int prime_sieve(int N) {

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes++;
        }
        return primes;
    }
    public static void main(String[] args) {
        System.out.println("There are " + prime_sieve(100) + " primes between 0 and 100.");
    }
}