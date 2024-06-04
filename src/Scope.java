import java.io.Console;
import java.util.Scanner;

public class Scope {

    public static int a = 90; // class scope
    private int a2 = 12;// object level scope

    /**
     * {@link java.lang.String}
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("i = " + scanner.nextInt());
//        System.out.println("scanner.nextLine() = " + scanner.nextLine());
//        System.out.println("a = " + a);
//        Console console = System.console();
//        String pass = new String(console.readPassword());
//        System.out.println("pass = " + pass);
        Scope scope = new Scope();
        System.out.println(scope.b + scope.c);

        sherzodzyoma:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; ) {
                j++;
                if (j % 3 == 0) {
                    break sherzodzyoma;
                }
                System.out.println("i j = " + i + " " + j);
            }
        }
    }

    int c;
    int b;
}
