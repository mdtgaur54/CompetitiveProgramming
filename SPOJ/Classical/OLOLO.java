package SPOJ.Classical;
import java.io.*;

/**
 * SPOJ 7742 - Onotole needs your help
 * Created by Darren on 14-7-21.
 * Using properties of XOR: x ^ x = 0
 * BufferedReader and Integer.parseInt() is not fast enough to get AC given the time limit.
 */
public class OLOLO {
    Parser in = new Parser();
    PrintWriter out = new PrintWriter(System.out, true);

    public static void main(String[] args) throws Exception {
        new OLOLO().run();
    }

    void run() throws Exception {
        int n = in.nextInt();
        int singleNumber = 0;
        while (n-- > 0)
            singleNumber ^= in.nextInt();
        out.println(singleNumber);
    }

    /**
     * A fast parser taking in an InputStream, with self-maintained buffer
     */
}
