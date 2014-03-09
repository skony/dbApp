package controllers;

import static play.data.Form.form;
import models.Course;
import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.createForm;
import views.html.editForm;
import views.html.list;

@Security.Authenticated(Secured.class)
public class Courses extends Controller {

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
	    return Application.GO_HOME;
	}

	public static Result list() {
		return ok(
	            list.render(
	                Course.findInvolving(request().username())
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
	    return Application.GO_HOME;
	}

	public static Result delete(String name) {
		Course.find.ref(name).delete();
	    flash("success", "Course has been deleted");
	    return Application.GO_HOME;
	}

}
