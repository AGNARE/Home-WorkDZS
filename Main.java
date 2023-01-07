import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {5,2,6,4,8,3,7};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSorted = false;

                    buf = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = buf;
                }
            }
        }
                System.out.println(Arrays.toString(numbers));

    }
}