public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println("Enter n >= 2.");
        }
        boolean[] prime = new boolean[n + 1];
        int i = 0;
        while (i <= n) {
            prime[i] = true;
            i++;
        }
        if (n >= 0) {
            prime[0] = false;
        }
        if (n >= 1) {
            prime[1] = false;
        }
        int x = 2;
        while (x * x <= n) {
            if (prime[x]) {
                int y = x * x;
                while (y <= n) {
                    prime[y] = false;
                    y += x;
                }
            }
            x++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        int z = 2;
        while (z <= n) {
            if (prime[z]) {
                System.out.println(z);
                counter++;
            }
            z++;
        }
        int total = n; 
        double percent = 0.0;
        if (total > 0) {
            percent = ((double) counter / total) * 100;
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int)percent + "% are primes)");
    }
}