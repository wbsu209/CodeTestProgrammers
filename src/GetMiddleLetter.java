public class GetMiddleLetter {
    public String solution(String s) {
        int length = s.length();
        int middleidex = length / 2;
        boolean isEvenLength = length % 2 == 0;

        if (isEvenLength) {
            return s.substring(middleidex - 1, middleidex + 1);
        }

        return s.substring(middleidex, middleidex + 1);
    }
}
