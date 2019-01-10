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
        if (m > 0) {
            // (m^2 * 4) - (shared matches)
            return m * m * MATCHES_IN_SQUARE - matchesMxM(m - 1); 
        } else {
            return 0;
        }
    }
}
