package models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.*;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.*;

import com.avaje.ebean.*;

@Entity
public abstract class User extends Model {

	@Id
    @Constraints.Required
    @Formats.NonEmpty
    public String email;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String password;
    
    public static User authenticate(String email, String password) {
        return find.where().eq("email", email)
            .eq("password", password).findUnique();
    }

    public static Finder<String,User> find = new Finder<String,User>(
        String.class, User.class
    );
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(User u: User.find.orderBy("name").findList()) {
            options.put(u.email, u.name);
        }
        return options;
    }

}