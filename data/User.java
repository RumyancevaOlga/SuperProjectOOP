package data;

public abstract class User {
    private String fio;
    private int birthday;
    private int passport;

    public User(String fio, int birthday, int passport) {
        this.fio = fio;
        this.birthday = birthday;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

}
