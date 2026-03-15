package level2;

public class problem1 {
    public static void main(String[] args) {

        int num = 6;
        int result = 1;

        for(int i = num; i >= 1; i--){
            result = result * i;
        }

        System.out.println("Factorial : " + result);

    }
}