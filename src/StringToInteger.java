public class StringToInteger {
    public int solution(String s) {
        int verify = verifyPlusMinus(s);
        if(verify == -1){
            return Integer.parseInt(s.substring(1)) * verify;
        }else{
            return Integer.parseInt(s);
        }
    }
    private int verifyPlusMinus(String s) {
        if(s.contains("-")){
            return -1;
        }else {
            return 1;
        }
    }
}
