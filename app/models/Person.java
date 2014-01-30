package models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.*;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.*;

import com.avaje.ebean.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Person extends Model {

	@Id
    @Constraints.Required
    @Formats.NonEmpty
    public String email;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String password;
    
    public static Person authenticate(String email, String password) {
        return find.where().eq("email", email)
            .eq("password", password).findUnique();
    }

    public static Finder<String,Person> find = new Finder<String,Person>(
        String.class, Person.class
    );
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Person u: Person.find.orderBy("name").findList()) {
            options.put(u.email, u.name);
        }
        return options;
    }

}