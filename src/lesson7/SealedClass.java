package lesson7;

public class SealedClass {
    public static void main(String[] args) {

    }
}


sealed class A permits B, C {
}

final class B extends A {
}

sealed class C extends A permits D, G {
}

final class D extends C {
}

non-sealed class G extends C {

}
