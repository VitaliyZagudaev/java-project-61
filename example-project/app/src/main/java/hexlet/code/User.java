package hexlet.code;

class User {
    private static String userName;

    User(String name) {
        this.userName = name;
    }
    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }
}
