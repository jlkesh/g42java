package lesson7;

public class PassBy {

    static void aa(Integer a) {
        a = 123;
    }

    public static void main(String... args) {
        int a = 12;
        aa(a);
        System.out.println("a = " + a);

        Integer b = 12123;
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));
        aa(b);
        System.out.println("b = " + b);

        Counter counter = new Counter();
        counter.count = 90;
        aa2(counter);
        System.out.println("counter.count = " + counter.count);
    }


    static void aa2(Counter counter) {
        counter.count = 123;
    }

    static class Counter {
        volatile int count = 0;
    }
}
