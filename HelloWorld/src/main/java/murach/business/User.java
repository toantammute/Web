package murach.business;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String birth;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birth ="";
    }

    public User(String firstName, String lastName, String email, String birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birth = birth;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth(){
        return birth;
    }

    public void getBirth(String birth){
        this.birth = birth;
    }
}
