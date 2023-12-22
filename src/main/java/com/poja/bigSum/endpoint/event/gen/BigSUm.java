package com.poja.bigSum.endpoint.event.gen;
import java.math.BigInteger;
public class BigSUm {
        public String calculateBigSum(String a, String b) {
            try {
                BigInteger bigA = new BigInteger(a);
                BigInteger bigB = new BigInteger(b);

                BigInteger sum = bigA.add(bigB);

                return sum.toString();
            } catch (NumberFormatException e) {
                return "The parameters are not valid numbers.";
            }
        }
}


