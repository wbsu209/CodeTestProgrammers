public class SumBetweenTwoIntegers {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        int start = 0;
        int end = 0;

        if (a > b) {
            start = b;
            end = a;
        } else if (b > a) {
            start = a;
            end = b;
        }

        long answer = 0;

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
    //min max 메서드를 만들어서, 파라미터에 넣어주는 방식으로 개선
}
