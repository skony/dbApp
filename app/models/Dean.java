package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;

@Entity
@DiscriminatorValue("dean")
public class Dean extends Person {
	
	public static boolean isDean(String user)
	{
		if(!find.where().eq("email", user).eq("dtype", "dean").findList().isEmpty())
			return true;
		else
			return false;	
	}
}
