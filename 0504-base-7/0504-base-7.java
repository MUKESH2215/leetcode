class Solution {
    public String convertToBase7(int n) {
        int num = Math.abs(n);
        if(num==0) return "0";
       StringBuilder sb = new StringBuilder();
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(n<0)
        sb.append("-");
        return sb.reverse().toString();
    }
}