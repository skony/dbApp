
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
        <title>E-university</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Application.index)),format.raw/*11.47*/("""" id="logo"><span>E-</span>university</a>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Application.register)),format.raw/*12.50*/("""" > Register!</a>
        </header>
        """),_display_(Seq[Any](/*14.10*/helper/*14.16*/.form(routes.Application.authenticate)/*14.54*/ {_display_(Seq[Any](format.raw/*14.56*/("""
   <h1>Sign in</h1>
   """),_display_(Seq[Any](/*16.5*/if(form.hasGlobalErrors)/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
    <p class="error">
        """),_display_(Seq[Any](/*18.10*/form/*18.14*/.globalError.message)),format.raw/*18.34*/("""
    </p>
	""")))})),format.raw/*20.3*/("""

   <p>
       <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*23.69*/form("email")/*23.82*/.value)),format.raw/*23.88*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password">
   </p>
   <p>
       <button type="submit">Login</button>
   </p>
""")))})),format.raw/*31.2*/("""
    
    </body>
</html>"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 11 11:53:00 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/login.scala.html
                    HASH: aacd1e5e7c774298f84a69275960738d9f95d1d6
                    MATRIX: 791->1|916->32|1065->146|1079->152|1132->184|1239->256|1253->262|1310->297|1411->362|1426->368|1466->386|1566->450|1581->456|1624->477|1705->522|1720->528|1767->566|1807->568|1867->593|1900->617|1940->619|2008->651|2021->655|2063->675|2106->687|2219->764|2241->777|2269->783|2456->939
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|51->23|51->23|51->23|59->31
                    -- GENERATED --
                */
            