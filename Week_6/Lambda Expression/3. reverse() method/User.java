class User implements Comparable<User> {
    private String name;
    private String mobileNumber;
    private String username;
    private String password;

    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s", name, mobileNumber);
    }

    @Override
    public int compareTo(User other) {
        return this.name.compareTo(other.getName());
    }
}
