
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Application.index)),format.raw/*11.47*/("""" id="logo"><span>Zen</span>tasks</a>
        </header>
        """),_display_(Seq[Any](/*13.10*/helper/*13.16*/.form(routes.Application.authenticate)/*13.54*/ {_display_(Seq[Any](format.raw/*13.56*/("""
   <h1>Sign in</h1>
   """),_display_(Seq[Any](/*15.5*/if(form.hasGlobalErrors)/*15.29*/ {_display_(Seq[Any](format.raw/*15.31*/("""
    <p class="error">
        """),_display_(Seq[Any](/*17.10*/form/*17.14*/.globalError.message)),format.raw/*17.34*/("""
    </p>
	""")))})),format.raw/*19.3*/("""

   <p>
       <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*22.69*/form("email")/*22.82*/.value)),format.raw/*22.88*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password">
   </p>
   <p>
       <button type="submit">Login</button>
   </p>
""")))})),format.raw/*30.2*/("""
    
    </body>
</html>"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 10 00:37:14 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/login.scala.html
                    HASH: 01654e9f720c91335627608fbc8e5aec36168a47
                    MATRIX: 791->1|916->32|1061->142|1075->148|1128->180|1235->252|1249->258|1306->293|1407->358|1422->364|1462->382|1563->447|1578->453|1625->491|1665->493|1725->518|1758->542|1798->544|1866->576|1879->580|1921->600|1964->612|2077->689|2099->702|2127->708|2314->864
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|50->22|50->22|50->22|58->30
                    -- GENERATED --
                */
            