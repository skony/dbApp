package models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;

@Entity
@DiscriminatorValue("professor")
public class Professor extends Person {
	
	public static boolean isProfessor(String user)
	{
		if(!find.where().eq("email", user).eq("dtype", "professor").findList().isEmpty())
			return true;
		else
			return false;	
	}
	
	public static Finder<String,Professor> find = new Finder<String,Professor>(
	String.class, Professor.class
	);
	
	public static Map<String,String> options() {
	        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
	        for(Professor p: Professor.find.orderBy("name").findList()) {
	            options.put(p.email, p.name);
	        }
	        return options;
	}
}
