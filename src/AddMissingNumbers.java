public class AddMissingNumbers {
    public int solution(int[] numbers) {

        int total = sumNaturalNumber(9);

        for(int i : numbers){
            total -= i;
        }
        return total;
    }

    private int sumNaturalNumber(int finalNumber){
        if(finalNumber <= 1){
            return finalNumber;
        }else {
            return (finalNumber*(finalNumber+1))/2;
        }
    }
}
