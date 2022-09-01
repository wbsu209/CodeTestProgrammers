public class FindNumberRemainsIsOne {
    public int solution(int n) {
        int answer = 0;
        for(int divide = 2; divide < n ; divide++){
            if(n % divide == 1){
                answer = divide;
                break;
            }
        }
        return answer;
    }
}
