package org.hohieu.mathutil.core;

public class MathUtility {
    
    public static final double PI = 3.1415;
    
    // ham tinh n! = 1.2.3.4.5....n
    // thiet ke:
    // 0! = 1! = 1
    // ko co' giai thua cho so a^m, bi. chui, nem' ra Exception
    // 21! so qua' lon' nen chi? tinh tu 0....20 >= 21! Exception
    public static long getFactorial(int n) {
        
        if ( n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20, plz.");
        }
        
        if( n == 0 || n == 1) {
            return 1;
        }
        
        long product = 1; // nhân dồn 1 2 3 4 5
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
