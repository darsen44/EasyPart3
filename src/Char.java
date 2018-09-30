import java.util.Scanner;

//Task 3
public class Char {
    public static void main(String[] args) {
        System.out.println("Enter character(check only first symbol): ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isDigit(ch))
            System.out.println(ch + " is Digit");
        else if(Character.isLetter(ch))
            System.out.println(ch + " is Letter");
        else System.out.println(ch + " is punctuation mark");
    }
}
