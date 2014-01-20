package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class Kurs extends Model {
	
	@Id
	public String name;
	public int students_limit;
	public String selection;
	//@ManyToOne
	//public Profesor profesor;
	//@ManyToMany
	//public Map<Student, String> participants = new HashMap<Student, String>();
	
	public Kurs(String name, int students_limit, String selection, Profesor profesor) {
		this.name = name;
		this.students_limit = students_limit;
		this.selection = selection;
		//this.profesor = profesor;
	}
	
	public static Finder<String,Kurs> find = new Finder<String,Kurs>(
	        String.class, Kurs.class
	    ); 
}
