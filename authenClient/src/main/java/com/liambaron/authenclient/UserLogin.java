package com.liambaron.authenclient;

import javax.ejb.Stateless;

/**
 *
 * @author UBAROLI
 */
@Stateless
public class UserLogin {
    private String email;
    private String pass;

    public UserLogin() {
    }

    public String getEmail() {
        System.out.println("The getEmail function was called");
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        System.out.println("The setEmail function was called");
        this.email = email;
    }

    public String getPass() {
        System.out.println(pass);
        System.out.println("The getPass function was called");
        return pass;
    }

    public void setPass(String pass) {
        System.out.println("The setPass function was called");
        this.pass = pass;
    }

}
