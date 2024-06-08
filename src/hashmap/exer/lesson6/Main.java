package hashmap.exer.lesson6;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(3);
        map.put("one", 1);
        map.put("two", 2);
        map.put("one", 1123);
        map.put("one", 1121231233);
        map.put("three", 3);
        map.put("four", 4);
        map.forEach(System.out::println);
        map.forEach((k, v) -> System.out.println(k + "::::" + v));
        /*for (HashMap.Entry<String, Integer> entry : map) {
            System.out.println("entry = " + entry);
        }*/
    }
}
