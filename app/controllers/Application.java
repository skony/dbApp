package controllers;

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
            routes.Courses.list()
        );
    
    public static Result index() {
    	Logger.debug("index:");
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

}
