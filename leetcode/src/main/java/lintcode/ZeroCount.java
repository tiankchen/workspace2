package lintcode;

public class ZeroCount {

    /**
     * @brief 计算 n! 尾数中 0 的数目
     */
    public long trailingZeros(long n) {

        long count = 0;
        for(int i = 1; Math.pow(5,i) <= n; i++) {
            count += n / (long)Math.pow(5,i);//注意强制类型转换
        }
        return count;
//        long count2 = 0;
//        long count5 = 0;
//
//        for (long i = 2; i <= n; ++i) {
//            long tmp = 0;
//
//            tmp = calcuFactor2(i);
//            count2 += tmp;
//
//            tmp = calcuFactorCount(i, 5);
//            count5 += tmp;
//        }
//
//        return count2 < count5 ? count2 : count5;
    }

    /**
     * @param n
     * @param divisor
     * @return
     * @brief 计算数字 n 中，包含约数 d 的个数
     */
    private long calcuFactorCount(long n, long divisor) {

        long dividend = n;
        long quotient = n / divisor;   //商
        long remainder = n % divisor;   //余数

        long count = 0;
        while (remainder == 0) {
            dividend = quotient;
            quotient = dividend / divisor;
            remainder = dividend % divisor;

            ++count;
        }

        return count;
    }

    /**
     * @param n
     * @return
     * @brief 计算数字 n 中因数 2 的个数
     */
    public long calcuFactor2(long n) {

        long count = 0;
        long num = n;
        long result = num & 1;
        while (result == 0) {
            ++count;
            num = num >> 1;
            result = num & 1;
        }

        return count;
    }
}
