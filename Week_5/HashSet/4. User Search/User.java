public class User implements Comparable<User> {
    private String username;
    private String bankname;

    public User(String username, String bankname) {
        this.username = username;
        this.bankname = bankname;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public int compareTo(User user) {
        return username.compareTo(user.getUsername());
    }
}
