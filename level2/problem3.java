package level2;

public class problem3 {
    public static void main(String[] args) {

        int number = 4567;
        int rev = 0;

        while(number > 0){
            int d = number % 10;
            rev = rev * 10 + d;
            number = number / 10;
        }

        System.out.println("Reverse : " + rev);

    }
}