package Account;

public class Account {

    private String email;
    private String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ("\nEmail: " + this.email + "\nPassword: " + this.password);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Account) {
            Account a = (Account) obj;
            return a.getEmail().equals(this.email);
        }
        return false;
    }

    public boolean authenticate(String password)
            throws WrongPassWordException {
        if (this.password.equals(password)) {
            return true;
        }
        throw new WrongPassWordException();

    }

    public void ChangePass(String newPassword) {
        this.password = newPassword;
    }

    public void resetPass(String resetPassword) {
        this.password = resetPassword;
    }
}
