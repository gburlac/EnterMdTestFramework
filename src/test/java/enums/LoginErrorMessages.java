package enums;

public enum LoginErrorMessages {
    EMAIL_ERROR("Adresa de e-mail din campul E-mail este invalida."),
    PASSWORD_ERROR("Campul Parola este obligatoriu."),
    EMAIL_AND_PASSWORD_ERROR("Numele de utilizator sau parola introdusa este incorecta. Va rugam sa incercati din nou.");

   private String message;

    LoginErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
