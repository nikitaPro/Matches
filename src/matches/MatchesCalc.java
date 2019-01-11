package matches;

public class MatchesCalc {
    public static final int MATCHES_IN_SQUARE = 4;
    
    /**
     * @param n - number of squares;
     * */
    public int minimumNumber(int n) {
        // n = m * m + x
        int m = (int)Math.floor(Math.sqrt(n));
        int sqr = m * m;
        int x = n - sqr;
        int d = (int)Math.ceil((double)x / (double)m);
        return matchesMxM(m) + x * 2 + d; // MxM matches + other matches of x squares.
    }
    
    protected int matchesMxM(int m) {
        int res = 0;
        int shared = res;
        for (int i = 1; i < m; i++) {
            res = i * i * MATCHES_IN_SQUARE - shared;
            shared = res;
        }
        // (m^2 * 4) - (shared matches)
        res = m * m * MATCHES_IN_SQUARE - shared;
        return res;
    }
}
