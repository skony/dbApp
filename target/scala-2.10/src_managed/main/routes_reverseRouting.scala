// @SOURCE:/home/piotrek/Kodzenie/db/conf/routes
// @HASH:d7ad93265b544576a66ea39ddf723627466493be
// @DATE:Thu Jan 30 00:14:16 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def edit(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:14
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses/new")
}
                                                

// @LINE:11
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "courses" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:22
def delete(name:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/delete")
}
                                                

// @LINE:15
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses")
}
                                                

// @LINE:19
def update(name:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "courses/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:8
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:14
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/new"})
      }
   """
)
                        

// @LINE:11
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:22
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/delete"})
      }
   """
)
                        

// @LINE:15
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
      }
   """
)
                        

// @LINE:19
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
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
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
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
        


// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def edit(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(name), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[String]), "GET", """ Edit existing course""", _prefix + """courses/$name<[^/]+>""")
)
                      

// @LINE:14
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "GET", """ Add course""", _prefix + """courses/new""")
)
                      

// @LINE:11
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Courses list (look at the default values for pagination parameters)""", _prefix + """courses""")
)
                      

// @LINE:22
def delete(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(name), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[String]), "POST", """ Delete a course""", _prefix + """courses/$name<[^/]+>/delete""")
)
                      

// @LINE:15
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq(), "POST", """""", _prefix + """courses""")
)
                      

// @LINE:19
def update(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(name), HandlerDef(this, "controllers.Application", "update", Seq(classOf[String]), "POST", """""", _prefix + """courses/$name<[^/]+>""")
)
                      

// @LINE:8
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    