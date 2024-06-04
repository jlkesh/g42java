package oop.l1;

public final class ManualImmutableClass {
    private final int a;
    private final int b;

    public ManualImmutableClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int a() {
        return a;
    }

    public int b() {
        return b;
    }
}
