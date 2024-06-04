package oop.l1;

import java.io.*;

public record CompactConstructor(
        int field1,
        int field2) {

    public CompactConstructor(int field1, int field2) {
        System.out.println("fgdhjlgjhgf");
        this.field1 = field1 + 1;
        this.field2 = field2 + 2;
    }

    public String fdfd() {
        return this.field1 + "asdasd";
    }

    public static int aaa() {
        return 123;
    }

}
