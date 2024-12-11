import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger i = new BigInteger(num1);
        BigInteger y = new BigInteger(num2) ;
        BigInteger m = i.multiply(y);
        return m.toString();
    }
}