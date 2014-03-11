// @SOURCE:/home/piotrek/Kodzenie/db/conf/routes
// @HASH:ee3ab42f92ab23a4d10a8d5ddd6c15250fd48d9d
// @DATE:Tue Mar 11 10:48:27 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseCourses {
    

// @LINE:19
def signUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/sign")
}
                                                

// @LINE:20
def addParticipant(user:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/signup" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("user", user)))))
}
                                                

// @LINE:23
def edit(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:15
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/new")
}
                                                

// @LINE:12
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses")
}
                                                

// @LINE:27
def delete(name:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/delete")
}
                                                

// @LINE:16
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses")
}
                                                

// @LINE:24
def update(name:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseCourses {
    

// @LINE:19
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/sign"})
      }
   """
)
                        

// @LINE:20
def addParticipant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.addParticipant",
   """
      function(user) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/signup" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("user", user)])})
      }
   """
)
                        

// @LINE:23
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.edit",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:15
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/new"})
      }
   """
)
                        

// @LINE:12
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
      }
   """
)
                        

// @LINE:27
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.delete",
   """
      function(name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/delete"})
      }
   """
)
                        

// @LINE:16
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
      }
   """
)
                        

// @LINE:24
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Courses.update",
   """
      function(name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:30
class ReverseAssets {
    

// @LINE:30
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseCourses {
    

// @LINE:19
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.signUp(), HandlerDef(this, "controllers.Courses", "signUp", Seq(), "GET", """SignUp to course""", _prefix + """courses/sign""")
)
                      

// @LINE:20
def addParticipant(user:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.addParticipant(user), HandlerDef(this, "controllers.Courses", "addParticipant", Seq(classOf[String]), "GET", """""", _prefix + """courses/signup""")
)
                      

// @LINE:23
def edit(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.edit(name), HandlerDef(this, "controllers.Courses", "edit", Seq(classOf[String]), "GET", """ Edit existing course""", _prefix + """courses/$name<[^/]+>""")
)
                      

// @LINE:15
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.create(), HandlerDef(this, "controllers.Courses", "create", Seq(), "GET", """ Add course""", _prefix + """courses/new""")
)
                      

// @LINE:12
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.list(), HandlerDef(this, "controllers.Courses", "list", Seq(), "GET", """ Courses list (look at the default values for pagination parameters)""", _prefix + """courses""")
)
                      

// @LINE:27
def delete(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.delete(name), HandlerDef(this, "controllers.Courses", "delete", Seq(classOf[String]), "POST", """ Delete a course""", _prefix + """courses/$name<[^/]+>/delete""")
)
                      

// @LINE:16
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.save(), HandlerDef(this, "controllers.Courses", "save", Seq(), "POST", """""", _prefix + """courses""")
)
                      

// @LINE:24
def update(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Courses.update(name), HandlerDef(this, "controllers.Courses", "update", Seq(classOf[String]), "POST", """""", _prefix + """courses/$name<[^/]+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    