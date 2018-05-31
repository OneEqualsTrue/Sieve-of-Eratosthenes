
public class Main {

    public static final int RANGE = 160;

    public static void main(String[] args) {

        int count = howManyPrimes(RANGE);
        System.out.println("\nNumber of Primes from 1 to "+RANGE+": "+count);
    }

    public static int howManyPrimes(int max) {
        int count = 1;
        boolean[] flagged = new boolean[max];
        int root_max = Math.toIntExact(Math.round(Math.sqrt(max)));

        for (int i = 2; i <= root_max; i++)
            if (!flagged[i])
                for (int j = i * i; j < max; j += i)
                    flagged[j] = true;

        System.out.print("1");

        for (int i = 2; i < max-1; i++) {
            if (!flagged[i]) {
                count++;
                System.out.print(", " + i);
            }
        }

        return count;
    }

}
