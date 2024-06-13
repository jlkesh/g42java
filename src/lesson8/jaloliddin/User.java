package lesson8.jaloliddin;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String groupId;

    private User(){}

    public static User ofGroupId(String groupId) {
        User user = new User();
        user.groupId = groupId;
        return user;
    }
}
