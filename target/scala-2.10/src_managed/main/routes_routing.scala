// @SOURCE:/home/piotrek/Kodzenie/db/conf/routes
// @HASH:5eb89a072533bf16c25209588dca2afa93ffb30c
// @DATE:Tue Mar 11 11:50:45 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:12
private[this] lazy val controllers_Courses_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses"))))
        

// @LINE:15
private[this] lazy val controllers_Courses_create5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/new"))))
        

// @LINE:16
private[this] lazy val controllers_Courses_save6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses"))))
        

// @LINE:19
private[this] lazy val controllers_Application_register7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:20
private[this] lazy val controllers_Application_addUser8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:23
private[this] lazy val controllers_Courses_signUp9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/sign"))))
        

// @LINE:24
private[this] lazy val controllers_Courses_addParticipant10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/signup"))))
        

// @LINE:27
private[this] lazy val controllers_Courses_edit11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Courses_update12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_Courses_delete13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("courses/"),DynamicPart("name", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:34
private[this] lazy val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses""","""controllers.Courses.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/new""","""controllers.Courses.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses""","""controllers.Courses.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""POST""", prefix,"""controllers.Application.addUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/sign""","""controllers.Courses.signUp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/signup""","""controllers.Courses.addParticipant(user:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/$name<[^/]+>""","""controllers.Courses.edit(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/$name<[^/]+>""","""controllers.Courses.update(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """courses/$name<[^/]+>/delete""","""controllers.Courses.delete(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:12
case controllers_Courses_list4(params) => {
   call { 
        invokeHandler(controllers.Courses.list(), HandlerDef(this, "controllers.Courses", "list", Nil,"GET", """ Courses list (look at the default values for pagination parameters)""", Routes.prefix + """courses"""))
   }
}
        

// @LINE:15
case controllers_Courses_create5(params) => {
   call { 
        invokeHandler(controllers.Courses.create(), HandlerDef(this, "controllers.Courses", "create", Nil,"GET", """ Add course""", Routes.prefix + """courses/new"""))
   }
}
        

// @LINE:16
case controllers_Courses_save6(params) => {
   call { 
        invokeHandler(controllers.Courses.save(), HandlerDef(this, "controllers.Courses", "save", Nil,"POST", """""", Routes.prefix + """courses"""))
   }
}
        

// @LINE:19
case controllers_Application_register7(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """ Add account""", Routes.prefix + """register"""))
   }
}
        

// @LINE:20
case controllers_Application_addUser8(params) => {
   call { 
        invokeHandler(controllers.Application.addUser(), HandlerDef(this, "controllers.Application", "addUser", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:23
case controllers_Courses_signUp9(params) => {
   call { 
        invokeHandler(controllers.Courses.signUp(), HandlerDef(this, "controllers.Courses", "signUp", Nil,"GET", """SignUp to course""", Routes.prefix + """courses/sign"""))
   }
}
        

// @LINE:24
case controllers_Courses_addParticipant10(params) => {
   call(params.fromQuery[String]("user", None)) { (user) =>
        invokeHandler(controllers.Courses.addParticipant(user), HandlerDef(this, "controllers.Courses", "addParticipant", Seq(classOf[String]),"GET", """""", Routes.prefix + """courses/signup"""))
   }
}
        

// @LINE:27
case controllers_Courses_edit11(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Courses.edit(name), HandlerDef(this, "controllers.Courses", "edit", Seq(classOf[String]),"GET", """ Edit existing course""", Routes.prefix + """courses/$name<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Courses_update12(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Courses.update(name), HandlerDef(this, "controllers.Courses", "update", Seq(classOf[String]),"POST", """""", Routes.prefix + """courses/$name<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_Courses_delete13(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Courses.delete(name), HandlerDef(this, "controllers.Courses", "delete", Seq(classOf[String]),"POST", """ Delete a course""", Routes.prefix + """courses/$name<[^/]+>/delete"""))
   }
}
        

// @LINE:34
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     