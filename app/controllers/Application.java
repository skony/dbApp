package controllers;

import static play.data.Form.form;
import models.Course;
import models.Dean;
import models.Student;
import models.Person;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    //public static Result index() {
      //  return ok(index.render("Your new application is ready."));
   // }
    public static Result GO_HOME = redirect(
            routes.Application.list(0, "name", "asc", "")
        );
    
    public static Result index() {
        return GO_HOME;
    }
	
    public static Result login() {
        return ok(login.render(Form.form(Login.class)));
    }
    
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
            routes.Application.login()
        );
    }
    
    public static class Login {

        public String email;
        public String password;
        
        public String validate() {
            if (Person.authenticate(email, password) == null) {
              return "Invalid user or password";
            }
            return null;
        }

    }
    
    public static Result authenticate() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                routes.Application.index()
            );
        }
    }
    
    public static Result create() {
        Form<Course> courseForm = form(Course.class);
        return ok(
            createForm.render(courseForm)
        );
    }
    
    public static Result save() {
        Form<Course> courseForm = form(Course.class).bindFromRequest();
        if(courseForm.hasErrors()) {
            return badRequest(createForm.render(courseForm));
        }
        courseForm.get().save();
        flash("success", "Course " + courseForm.get().name + " has been created");
        return GO_HOME;
    }
    
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Course.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    
    public static Result edit(String name) {
        Form<Course> courseForm = form(Course.class).fill(
        		Course.find.byId(name)
        );
        return ok(
            editForm.render(name, courseForm)
        );
    }
    
    public static Result update(String name) {
        Form<Course> courseForm = form(Course.class).bindFromRequest();
        if(courseForm.hasErrors()) {
            return badRequest(editForm.render(name, courseForm));
        }
        courseForm.get().update(name);
        flash("success", "Course " + courseForm.get().name + " has been updated");
        return GO_HOME;
    }
    
    public static Result delete(String name) {
    	Course.find.ref(name).delete();
        flash("success", "Course has been deleted");
        return GO_HOME;
    }

}
