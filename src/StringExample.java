public class StringExample {
    public static void main(String[] args) {
        String name = "Sherzod";
        String name2 = new String("Sherzod");
        String name3 = "Sher" + "zod";
        String name4 = name3 + "bek";
        String name5 = name4.substring(1, 4);
        String name6 = "Sherzod";
        String intern = name2.intern();

        StringBuilder a = new StringBuilder(500_000);
        for (int i = 0; i < 1e5; i++) {
            a.append("hello");
            System.out.println(a.length());
        }
    }
}
