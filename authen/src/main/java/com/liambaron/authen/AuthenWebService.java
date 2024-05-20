package com.liambaron.authen;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Liam Baron
 */
@WebService(serviceName = "AuthenWebService")
public class AuthenWebService {
    private final List<User> user = new ArrayList<>();
    /**
     * details web service operation that returns a list of 
     * instances of the User class
     * @return List<User>
     */
    @WebMethod(operationName = "details")
    public List<User> details() {
        User newUser = new User();
        User newUser1 = new User();  
           
        newUser.setEmail("Liam");
        newUser.setPassword("Liam1");
        user.add(newUser);

        newUser1.setEmail("Baron");
        newUser1.setPassword("Baron1");
        user.add(newUser1);

        return user;
    }
}
