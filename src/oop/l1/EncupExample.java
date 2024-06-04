package oop.l1;

public class EncupExample {
    public static void main(String[] args) {
        Identity identity = new Identity("AB", "1231234");
        User user = new User();
        user.setFullName("Sherzod Nurboyev");
        user.setIdentity(identity);
        System.out.println("identity = " + identity);
        System.out.println("user = " + user);
        identity.setSerial("SorryBro:)");
        System.out.println("identity = " + identity);
        System.out.println("user = " + user);
        Identity identity2 = user.getIdentity();
        identity2.setSerial("It was a joke");
        System.out.println("identity2 = " + identity2);
        System.out.println("user = " + user);

    }
}

class User {
    private String fullName;
    private Identity identity;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Identity getIdentity() {
        return new Identity(identity.getSerial(), identity.getNumber());
    }

    public void setIdentity(Identity identity) {
        this.identity = new Identity(identity.getSerial(), identity.getNumber());
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", identity=" + identity +
                '}';
    }
}

class Identity {
    private String serial;
    private String number;

    public Identity(String serial, String number) {
        this.serial = serial;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public String getSerial() {
        return serial;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "serial='" + serial + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}