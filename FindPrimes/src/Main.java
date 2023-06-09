import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(findPrimes(1, 100));

    }
    public static ArrayList<Integer> findPrimes(int start, int end){

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int n = start; n < end; n++){
            boolean prime = true;

            int i = 2;
            while (i <= n/2){
                //System.out.println("Checking if " + i + " is a multiple");
                if (n % i == 0){
                   // System.out.println("YES WE FOUND A MULTIPLE" +  i);
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime){
                primes.add(n);
            }
        }
        return primes;

    }
}