package Algorithms.Maths;

import java.io.*;
import java.util.*;
import java.math.*;

public class DSMaths {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Input in = new Input(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {
    static final long MOD = (long) 1e9 + 7;
    int[] primes;

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public void solve(int testNumber, Input in, PrintWriter out) {
        int n = in.nextInt();
        int[] s = new int[n];
        int max = 0;
        int min = 101;
        int minPos = n - 1;
        int maxPos = 0;
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
            if (s[i] > max) {
                max = s[i];
                maxPos = i;
            }
            if (s[i] <= min) {
                min = s[i];
                minPos = i;
            }
        }
        int ans = maxPos + n - minPos - 1;
        if (maxPos > minPos)
            ans--;
        out.println(ans);
    }

    public static boolean nextPermutation(int[] p) {
        for (int a = p.length - 2; a >= 0; --a)
            if (p[a] < p[a + 1])
                for (int b = p.length - 1;; --b)
                    if (p[b] > p[a]) {
                        int t = p[a];
                        p[a] = p[b];
                        p[b] = t;
                        for (++a, b = p.length - 1; a < b; ++a, --b) {
                            t = p[a];
                            p[a] = p[b];
                            p[b] = t;
                        }
                        return true;
                    }
        return false;
    }

    public static void generatePermutations(int[] p, int depth) {
        int n = p.length;
        if (depth == n) {
            System.out.println(Arrays.toString(p));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (p[i] == 0) {
                p[i] = depth;
                generatePermutations(p, depth + 1);
                p[i] = 0;
            }
        }
    }

    private long[][] matrixPow(long[][] a, long ex) {
        long[][] res = matrixUnit(a.length);
        if (ex == 0)
            return res;
        while (ex > 0) {
            if ((ex & 1) == 1) {
                res = matrixMul(res, a);
            }
            a = matrixMul(a, a);
            ex >>= 1L;
        }
        return res;
    }

    private long[][] matrixMul(long[][] a, long[][] b) {
        int r = a.length;
        int c = b[0].length;
        int l = a[0].length;
        long[][] res = new long[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < l; k++) {
                    res[i][j] += a[i][k] * b[k][j] % MOD;
                    res[i][j] %= MOD;
                }
            }
        }
        return res;
    }

    private long[][] matrixUnit(int n) {
        long[][] unit = new long[n][n];
        for (int i = 0; i < n; i++)
            unit[i][i] = 1;
        return unit;
    }

    private long[] getSumAndNumberOfDivisors(int n) {
        int lim = primes.length;
        long[] res = new long[2];
        long numberOfDivisor = 1;
        long sumOfDivisor = 1;
        for (int i = 0; i < lim; i++) {
            int p = primes[i];
            long ex = 0;
            long cur = 1;
            while (n % p == 0) {
                n /= p;
                ex++;
                cur += Math.pow(p, ex);
            }
            numberOfDivisor *= (ex + 1);
            sumOfDivisor *= cur;
            if (n == 1)
                break;
        }
        if (n > 1) {
            numberOfDivisor <<= 1L;
            sumOfDivisor *= (long) (n + 1);
        }
        res[0] = numberOfDivisor;
        res[1] = sumOfDivisor;
        return res;
    }

    private boolean isQuare(int[][] m) {
        long[] dist = new long[6];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                dist[index++] = dist(m[i][0], m[i][1], m[j][0], m[j][1]);
            }
        }
        Arrays.sort(dist);
        if (dist[0] == 0 || dist[5] == 0)
            return false;
        for (int i = 0; i < 2; i++) {
            if (dist[i] != dist[i + 1])
                return false;
        }

        return dist[4] == dist[5];
    }

    private long dist(long x1, long y1, long x2, long y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    static void rotate(int[][] m, int row) {
        int x = m[row][0] - m[row][2];
        int y = m[row][1] - m[row][3];
        m[row][0] = m[row][2] - y;
        m[row][1] = m[row][3] + x;
    }

    // didn't test
    static class BIT {
        int[] MAX;
        int[] MIN;
        int[] SUM;
        int n;

        public BIT(int n) {
            MAX = new int[n + 1];
            MIN = new int[n + 1];
            SUM = new int[n + 1];
            this.n = n;
        }

        public void setSum(int pos, int val) {
            for (int i = pos; i < n; i += (i & -i)) {
                SUM[i] += val;
            }
        }

        public int getSum(int to) {
            int sum = 0;
            for (int i = to; i > 0; i -= (i & -i)) {
                sum += SUM[i];
            }
            return sum;
        }

        public int getSum(int from, int to) {
            return getSum(to) - getSum(from);
        }

        public void setMax(int pos, int val) {
            for (int i = pos; i < n; i += (i & -i)) {
                MAX[i] = Math.max(val, MAX[i]);
            }
        }

        public int getMax(int to) {
            int max = 0;
            for (int i = to; i > 0; i -= (i & -i)) {
                max = Math.max(max, MAX[i]);
            }
            return max;
        }

        public void setMin(int pos, int val) {
            for (int i = pos; i < n; i += (i & -i)) {
                MIN[i] = Math.min(val, MIN[i]);
            }
        }

        public int getMin(int to) {
            int min = 0;
            for (int i = to; i > 0; i -= (i & -i)) {
                min = Math.min(min, MIN[i]);
            }
            return min;
        }

    }

    // didn't test
    static class DisjointSet {
        int[] set;

        public DisjointSet(int n) {
            set = new int[n];
            for (int i = 0; i < n; i++) {
                set[i] = i;
            }
        }

        public int findSet(int a) {
            if (set[a] == a)
                return a;
            return set[a] = findSet(set[a]);
        }

        public void unionSet(int a, int b) {
            set[findSet(a)] = findSet(b);
        }

        public boolean isSameSet(int a, int b) {
            return findSet(a) == findSet(b);
        }
    }

    static class SegmentTree {
        int[] MAX;
        int[] MIN;
        int[] SUM;
        int[] data;
        int n;

        public SegmentTree(int[] data) {
            this.n = data.length;
            this.data = data;
            MAX = new int[4 * n + 10];
            MIN = new int[4 * n + 10];
            SUM = new int[4 * n + 10];
            buildTree(1, 0, n - 1);
        }

        public int left(int root) {
            return root << 1;
        }

        public int right(int root) {
            return (root << 1) + 1;
        }

        private void buildTree(int root, int rl, int rr) {
            if (rr == rl) {
                MAX[root] = MIN[root] = SUM[root] = data[rr];
            } else {
                int rm = (rl + rr) >> 1;
                buildTree(left(root), rl, rm);
                buildTree(right(root), rm + 1, rr);
                MAX[root] = Math.max(MAX[left(root)], MAX[right(root)]);
                MIN[root] = Math.min(MIN[left(root)], MIN[right(root)]);
                SUM[root] = SUM[left(root)] + SUM[right(root)];
            }
        }

        public int getMax(int from, int to) {
            return getMax(1, 0, n - 1, from, to);
        }

        private int getMax(int root, int rl, int rr, int from, int to) {
            if (from > rr || to < rl || rl > rr) {
                return -1;
            }
            if (from == rl && to == rr) {
                return MAX[root];
            }
            int rm = (rr + rl) >> 1;
            int m1 = getMax(left(root), rl, rm, from, Math.min(to, rm));
            int m2 = getMax(right(root), rm + 1, rr, Math.max(from, rm + 1), to);
            return Math.max(m1, m2);
        }

        public int getMin(int from, int to) {
            return getMin(1, 0, n - 1, from, to);
        }

        private int getMin(int root, int rl, int rr, int from, int to) {
            if (from > rr || to < rl || rl > rr) {
                return Integer.MAX_VALUE;
            }
            if (from == rl && to == rr) {
                return MIN[root];
            }
            int rm = (rr + rl) >> 1;
            int m1 = getMin(left(root), rl, rm, from, Math.min(to, rm));
            int m2 = getMin(right(root), rm + 1, rr, Math.max(from, rm + 1), to);
            return Math.min(m1, m2);
        }

        public int getSum(int from, int to) {
            return getSum(1, 0, n - 1, from, to);
        }

        private int getSum(int root, int rl, int rr, int from, int to) {
            if (from > rr || to < rl || rl > rr) {
                return 0;
            }
            if (from == rl && to == rr) {
                return SUM[root];
            }
            int rm = (rr + rl) >> 1;
            int m1 = getSum(left(root), rl, rm, from, Math.min(to, rm));
            int m2 = getSum(right(root), rm + 1, rr, Math.max(from, rm + 1), to);
            return m1 + m2;
        }
    }

    private String lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return sb.reverse().toString();
    }

    private boolean isPrime(int n) {
        if (n <= 3)
            return n > 1;
        else if (n % 3 == 0 || n % 2 == 0)
            return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    private int[] getPrimes(int n) {
        int len = n + 1;
        boolean[] isPrimes = new boolean[len];
        int[] temps = new int[len];
        int index = 0;
        Arrays.fill(isPrimes, true);
        isPrimes[0] = isPrimes[1] = false;
        for (int i = 2; i * i < len; i++) {
            if (isPrimes[i]) {
                for (int j = i * i; j < len; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (isPrimes[i])
                temps[index++] = i;
        }
        int[] primes = Arrays.copyOf(temps, index);
        return primes;
    }

    static void swap(char[] arrays, int pos1, int pos2) {
        char tmp = arrays[pos1];
        arrays[pos1] = arrays[pos2];
        arrays[pos2] = tmp;
    }

    static void swap(int[] arrays, int pos1, int pos2) {
        int tmp = arrays[pos1];
        arrays[pos1] = arrays[pos2];
        arrays[pos2] = tmp;
    }

    static long modPow(long n, long ex) {
        long res = 1;
        while (ex > 0) {
            if ((ex & 1) == 1)
                res = res * n % MOD;
            n = n * n % MOD;
            ex >>= 1;
        }
        return res;
    }

    static long ModInverse(long n) {
        return modPow(n, MOD - 2);
    }

    static long nCr(int n, int r) {
        if (r > n)
            return -1;
        // return (f[n] * ModInverse((f[r] * f[n - r]) % MOD)) % MOD;
        return 0;
    }
}

class Input {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public Input(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}