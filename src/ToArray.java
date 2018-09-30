import java.util.Scanner;

// Task 1 and 2
public class ToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input only with digit 1 or 2
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int arr[] = new int[str.length()];
        for (int i = 0; n >= 1 ; i++) {
            arr[(arr.length - 1)- i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        toBigDigit(arr); // for Task 2
    }

    private static void toBigDigit(int[] arr) {
        for (int j = 0; j < 7 ; j++) {
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(bigDigital[arr[i]- 1][j]);
            }
            System.out.println();
        }
    }

    private static final String bigDigital[][] = { // Було впадло виписувати всі 10 цифр :)
            {"  1   "," 11   ","  1   ","  1   ","  1   ","  1   "," 111  ",},
            {" 222  ","2   2 ","2  2  ","  2   "," 2    ","2     ","22222 "}
    };
}
