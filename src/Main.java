import utils.pCheck;

import java.math.BigInteger;
import java.security.SecureRandom;

import static utils.help.GenerateP.generatePrime;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        BigInteger prime = generatePrime(100000, random);
        System.out.println("Generated Prime: " + prime);
        boolean result = pCheck.is_prime(prime);
        System.out.println(result);
    }
}