public class SumOfDivisor {
    public int solution(int number) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            if(isDivisor(number, i)){
                answer += i;
            }
        }
        return answer;
    }
    private boolean isDivisor(int number, int divide){
        if(number % divide == 0){
            return true;
        } else {
            return false;
        }
    }
}
