package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users(){
        this.userList=new ArrayList<>();
    }

    public void addUser(User user)
    {
        this.userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User tmp = new User();
        tmp.setUserName(userName);
        tmp.setPassword(password);

        this.userList.add(tmp);
    }

    public void deleteUser(User user)
    {
        for(int i=0; i<this.userList.size(); i++) {
            if(this.userList.get(i).equals(user)){
                userList.remove(i);
            }
        }
    }

    public boolean exists(User user)
    {
        for(int i=0; i<this.userList.size(); i++) {
            if(this.userList.get(i).equals(user)){
                return true;
            }
        }

        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i=0; i<this.userList.size(); i++) {
            if(this.userList.get(i).getUserName()==username){
                return true;
            }
        }

        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i=0; i<this.userList.size(); i++) {
            if(this.userList.get(i).getUserName()==userName){
                return this.userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return this.userList.size();
    }

    public User[] getUserArray()
    {
        User[] a = new User[this.userList.size()];
        for(int i = 0 ; i < this.userList.size();i++){
            a[i] = this.userList.get(i);
        }
        return a;
    }
}
