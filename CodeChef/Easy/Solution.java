package Easy;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger n1 = BigInteger.valueOf(n);
        BigInteger fact= new BigInteger("1");
        for(int i=1; i<=n; i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
