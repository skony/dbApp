package models;

import java.util.List;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;

@Entity
@DiscriminatorValue("student")
public class Student extends Person {
	
	public static boolean isStudent(String user)
	{
		if(!find.where().eq("email", user).eq("dtype", "student").findList().isEmpty())
			return true;
		else
			return false;	
	}
	
}
