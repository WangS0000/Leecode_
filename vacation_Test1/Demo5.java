package vacation_Test1;

public class Demo5 {
    //两数相除
    public int divide(int dividend, int divisor) {
        long ans = divide((long)dividend,(long)(divisor));
        long m = 2147483648L;
        if(ans == m ){
            return Integer.MAX_VALUE;
        }else{
            return (int)ans;
        }
    }
    public long divide(long dividend, long divisor) {
        long ans = 1;
        long sign = 1;
        if (dividend < 0) {
            sign = opposite(sign);
            dividend = opposite(dividend);
        }
        if (divisor < 0) {
            sign = opposite(sign);
            divisor = opposite(divisor);
        }
        long origin_dividend = dividend;
        long origin_divisor = divisor;

        if (dividend < divisor) {
            return 0;
        }

        dividend -= divisor;
        while (divisor <= dividend) {
            ans = ans + ans;
            divisor += divisor;
            dividend -= divisor;
        }
        long a = ans + divide(origin_dividend - divisor, origin_divisor);
        return sign > 0 ? a : opposite(a);
    }
    public long opposite(long x) {
        return ~x + 1;
    }
}
