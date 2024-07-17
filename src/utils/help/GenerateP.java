package utils.help;

import java.math.BigInteger;
import java.security.SecureRandom;

public class GenerateP {


    public static BigInteger generatePrime(int upperBound, SecureRandom random) {
        BigInteger prime;
        do {
            prime = BigInteger.probablePrime((int) (Math.log(upperBound) / Math.log(2)), random);
        } while (prime.compareTo(BigInteger.valueOf(upperBound)) >= 0);
        return prime;
    }
}
