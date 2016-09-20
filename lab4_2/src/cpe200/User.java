package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {}

    public boolean setUserName(String name) {

        String regex = "(^[A-z]{1})([A-z0-9]{7,})";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);

        if(!m.matches()){
            return false;
        }

        this.userName = name;

        return true;
    }

    public boolean setPassword(String name) {

            if(name.length()<12){
                return false;
            }

            this.password = name;

            Pattern p1 = Pattern.compile("[a-z]");
            Matcher m1 = p1.matcher(name);
            Pattern p2 = Pattern.compile("[A-Z]");
            Matcher m2 = p2.matcher(name);
            Pattern p3 = Pattern.compile("[0-9]");
            Matcher m3 = p3.matcher(name);
            if(m1.find()&&m2.find()&&m3.find()){
                return true;
            }
            return false;
        }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
