import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger number1=new BigInteger(num1);
        BigInteger number2=new BigInteger(num2);
        BigInteger ans=number1.multiply(number2);
        String fans=ans.toString();
        return fans;
    }
}