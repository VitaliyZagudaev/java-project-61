package hexlet.code;

public class User {
    private static String userName;

    User(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }
}
