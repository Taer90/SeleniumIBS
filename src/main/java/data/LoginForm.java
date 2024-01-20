package data;

public enum LoginForm {
    CORRECT_LOGIN("Секретарь"),
    CORRECT_PASSWORD("testing");


    private String data;


    LoginForm(String data) {
        this.data = data;
    }

    public String toString() {
        return data;
    }

}
