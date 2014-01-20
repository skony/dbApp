package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public abstract class User extends Model {

    @Id
    public String email;
    public String name;
    public String password;
    
    public User(String email, String name, String password) {
      this.email = email;
      this.name = name;
      this.password = password;
    }
    
    String getemail() {
    	return this.email;
    }
    
    void setemail(String email) {
    	this.email = email;
    }
    
    public static User authenticate(String email, String password) {
        return find.where().eq("email", email)
            .eq("password", password).findUnique();
    }

    public static Finder<String,User> find = new Finder<String,User>(
        String.class, User.class
    );
    

}