package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import com.avaje.ebean.Page;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;


@Entity
public class Course extends Model {
	
	@Id
    @Constraints.Required
    @Formats.NonEmpty
	public String name;
	@ManyToOne
	@Constraints.Required
	public Professor professor;
	@Constraints.Required
	public int students_limit;
	//@Constraints.Required
	//public String selection;
	//@ManyToMany
	//public Map<Student, String> participants = new HashMap<Student, String>();
	/*
	public Kurs(String name, int students_limit, String selection, Profesor profesor) {
		this.name = name;
		this.students_limit = students_limit;
		this.selection = selection;
		//this.profesor = profesor;
	}*/
	
	public static Finder<String,Course> find = new Finder<String,Course>(
	        String.class, Course.class
	    ); 
	
	public static Page<Course> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("professor")
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }
}
