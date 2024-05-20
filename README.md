# login-authentication
 I created a basic login authentication maven web application using JSP 

What I used to run the project:
- Netbeans 12.6
- Glassfish 4.0
- Java 8
- Java EE 7

Note:
When building the 'authenClient' application the problem I was running into was that one of the files
was not built properly when you press clean and build. This issue does not occur when you use a upgraded
version of Netbeans and when you just press build.

Let's say its not working what you need to do is copy the this text:
'
@Override
    public String toString() {
        return email + " " + password;
    }
'

Then place it into the 'User.java' file located in the authenClient web application then 'Generated Sources' folder,
next into the 'com.liambaron.authenclient' folder. Finally you want to place the copied text in the class. 