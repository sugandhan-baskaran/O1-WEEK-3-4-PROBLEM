package level3;

public class problem1 {
    public static void main(String[] args) {

        int value = 121;
        int copy = value;
        int reverse = 0;

        while(copy != 0){
            int r = copy % 10;
            reverse = reverse * 10 + r;
            copy /= 10;
        }

        if(reverse == value)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
