package oop.l1;

public class HasARelationshipExample {
    public static void main(String[] args) {
        Heart heart = new Heart();
        Person person = new Person(heart);
        person.setName("Hola");
        person.setAddress(new Address());
    }
    private static class Person{
        private String name;
        private Address address;
        private final Heart heart;

        private Person(Heart heart) {
            this.heart = heart;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    private static class Address{
        private String street;
    }

    private static class Heart {

    }
}
