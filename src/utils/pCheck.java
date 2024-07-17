package utils;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class pCheck {

    public static boolean is_prime (int p) {
        if(p == 2 | p == 3 ) {
            return true;
        }

        if (p < 2 | p%2 == 0) { //Checks even numbers, numbers below 2. 1 and 0 are not prime
            return false;
        }
        if (p < 9) {
            return true; //unsure if this works in java, but after all the other if checks are done
            //the remanining numbers (5 and 7) are prime.
        }
        if (p%3 == 0) {
            return false;
        }
        int r = (int) Math.pow(p, 0.5);
        int f = 5;
        while (f <= r) {
            if (p % f == 0) {
                return false;
            }
            if (p % (f+2) == 0) {
                return false;
            }
            f += 6;
        }
        return true;
  }
    public static boolean is_prime (BigInteger p) {
        return p.isProbablePrime(100);
    }

    public static void pConstraints(int p) {
        if(p < 10_000){
            System.out.println("Generally, the prime used or Diffie-Hellman is considered /" +
                    "insecure below ... Would you like to choose another prime or get the/" +
                    "program to generate one for you? [1] Enter a new prime [2] Generate a large prime for me /" +
                    "[2] Continiue with this prime: " + p);

            if Scanner.input == 1 2 3

        }
    }


}
