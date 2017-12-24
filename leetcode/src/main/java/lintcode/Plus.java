package lintcode;

public class Plus {

    public int plus(int a, int b) {

        /*
        1. 输入 a, b
        2. 计算忽略进位的相加，即a与b的异或
        3. 计算进位，(a&b)<<1
        4. 如果进位为0，终止，返回sum
        5. 将2和3的结果重复至1
         */

        validate(a, b);

        int sum = 0;
        int carry = 0;

        do {
            sum = a ^ b;
            carry = (a & b) << 1;

            a = sum;
            b = carry;
        } while (carry != 0);

        return sum;
    }

    private void validate(int a, int b){
        int substract = Integer.MAX_VALUE - a;
        if(b > substract)
            throw new IllegalArgumentException(String.format("%d + %d beyond Integer max value %d", a, b, Integer.MAX_VALUE ));
    }
}
