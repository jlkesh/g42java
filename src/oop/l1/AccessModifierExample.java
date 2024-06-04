package oop.l1;

public class AccessModifierExample {

}

class B{
    protected void b1(){}
    public void b2(){}
}

class A extends B{
    @Override
    public void b1() {
        super.b1();
    }

    @Override
    public void b2() {
        super.b2();
    }

}