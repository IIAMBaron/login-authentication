package com.liambaron.authen;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Liam Baron
 */

@XmlRootElement
public class User {
    private String password;
    private String email;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return email + " " + password;
    }

}
