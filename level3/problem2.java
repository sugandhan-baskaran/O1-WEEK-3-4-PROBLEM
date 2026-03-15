package level3;

public class problem2 {
    public static void main(String[] args) {

        int num = 153;
        int sum = 0;
        int temp = num;

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + digit*digit*digit;
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");

    }
}