package pages;

public enum Users {

    REGISTEREDUSER("abramov.stas@gmail.com", "123NRTM456"),
    UNREGISTEREDUSER("test@test.com", "testpassword"),
    UNREGISTEREDUSER2("test@", "");

    private String email;
    private String password;

    Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
