package level1;

public class problem3 {
    public static void main(String[] args) {

        int first = 9;
        int second = 14;

        System.out.println("Before Swap : " + first + " " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swap : " + first + " " + second);

    }
}