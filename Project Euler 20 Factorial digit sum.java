public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger ten = new BigInteger("10");
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            BigInteger factorial = BigInteger.ONE;
            BigInteger sum = BigInteger.ZERO;
            for (int j = 1; j <= num; j++) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            int len = factorial.toString().length();
            for (int k = 0; k < len; k++) {
                sum = sum.add(factorial.mod(ten));
                factorial = factorial.divide(ten);
            }
            System.out.println(sum);
        }
    }
}