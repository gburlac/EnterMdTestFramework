package enums;



public enum Users {
    REGISTERED_USER("Stanislav Abramov","abramov.stas@gmail.com", "123NRTM456"),
    FACEBOOK_USER("", "",""),
    VKONTAKTE_USER("", "",""),
    ODNOKLASSNIKI_USER("", "","");

    private String email;
    private String password;
    private String userName;

    Users(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

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

    public String getUserName(){
        return userName;
    }
}
