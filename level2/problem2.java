package level2;

public class problem2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int count = 8;

        System.out.print(a + " " + b + " ");

        for(int i = 0; i < count; i++){
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }
}
