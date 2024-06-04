package oop.l1;

public class ConstructorExample {
    public static void main(String[] args) {

    }
}

class CC {
    int field1;
    int field2;

    public CC(CC cc) {
        this.field1 = cc.field1;
        this.field2 = cc.field2;
    }
}
