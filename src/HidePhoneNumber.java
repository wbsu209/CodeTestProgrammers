public class HidePhoneNumber {
    public String solution(String phone_number) {
        int number_length = phone_number.length();
        int hide_number_index = number_length - 4;
        String end_number = phone_number.substring(hide_number_index, number_length);

        String answer = "";

        for (int i = 0; i < hide_number_index; i++) {
            answer += "*";
        }

        return answer + end_number;
    }
}
