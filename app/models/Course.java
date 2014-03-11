package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.SqlUpdate;

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
	@ManyToMany
	public List<Student> participants = new ArrayList<Student>();
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
	
	public static List<Course> findInvolving(String user) {
        return find.where()
            .eq("professor.email", user)
            .findList();
    }
	
	public static List<Course> findAll()
	{
		return find.findList();
	}
	
	public static List<Course> findStudentsCourses(String student)
	{		
		return find.where()
				.eq("participants.email", student)
				.findList();
	}
	
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
	
	 public static boolean isOwner(String course, String professor) {
	        return find.where()
	            .eq("professor.email", professor)
	            .eq("name", course)
	            .findRowCount() > 0;
	    }
	 
	 public static void addParticipant(String name, String user){
		 //Course course = find.where().eq("name", name).findUnique();
		 String suser = "pskonieczny@gmail.com";
		 String sname = "Systemy baz danych";
		 String query = "INSERT INTO course_person VALUES ('" + sname + "', '" + suser + "')";
		 SqlUpdate insert = Ebean.createSqlUpdate(query);
		 insert.execute(); 
	 }
	 
	 public static void update(String name, Course course)
	 {
		 course.update((Object)name);
	 }
	 
}
