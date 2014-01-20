package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;

@Entity
public class Student extends User {
	
	public static Finder<String,Student> find = new Finder<String,Student>(
	        String.class, Student.class
	    );

	public Student(String email, String name, String password) {
		super(email, name, password);
		// TODO Auto-generated constructor stub
	}
}
