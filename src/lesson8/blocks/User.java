package lesson8.blocks;

public class User {

    {
        System.out.println("inside non-static block 1");
    }

    {
        System.out.println("inside non-static block 2");
    }

    public User() {
        System.out.println("inside no-args constructor");
    }

    public User(int a) {
        System.out.println("inside constructor int");
    }

    public User(String code) {
        System.out.println("inside constructor String");
    }

    static {
        System.out.println("inside static block 2");
        System.out.println("inside static block 1");
    }

    public static void main(String[] args) {
        new User();
        new User(1);
        new User("asd");

    }
}
