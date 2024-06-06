package hashmap.exer.sherzod;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(3,3);
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.capacity());
        map.put("one", 1123);
        System.out.println(map.capacity());
        map.put("three", 3);
        System.out.println(map);
        System.out.println(map.getSize());
        map.put("four", 4);
        map.put("four2", 4);
        map.put("four3", 4);
        map.put("four4", 4);
        System.out.println(map.getSize());
        System.out.println(map.capacity());
        System.out.println(map);
        Users users = new Users(new User[]{
                new User("Sherzod"),
                new User("Azamjon")
        });

//        map.forEach((k,v)->{});
//        map.getKeySet();
        for(User user : users){
            System.out.println("user = " + user);
        }
    }
}
