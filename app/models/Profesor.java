package models;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

@Entity
public class Profesor extends User {

	public Profesor(String email, String name, String password) {
		super(email, name, password);
		// TODO Auto-generated constructor stub
	}

}
