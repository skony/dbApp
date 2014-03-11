
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Account],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(personForm: Form[Account]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

<html>
    <head>
        <title>E-university</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.70*/routes/*11.76*/.Assets.at("stylesheets/login.css"))),format.raw/*11.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Application.index)),format.raw/*15.47*/("""" id="logo"><span>E-</span>university</a>
        </header>
        
    """),_display_(Seq[Any](/*18.6*/form(routes.Application.addUser())/*18.40*/ {_display_(Seq[Any](format.raw/*18.42*/("""
    
    	<fieldset>

 		"""),_display_(Seq[Any](/*22.5*/inputText(personForm("email"), '_label -> "email"))),format.raw/*22.55*/("""
 		"""),_display_(Seq[Any](/*23.5*/inputText(personForm("name"), '_label -> "name"))),format.raw/*23.53*/("""
 		"""),_display_(Seq[Any](/*24.5*/inputText(personForm("password"), '_label -> "password"))),format.raw/*24.61*/("""
 		"""),_display_(Seq[Any](/*25.5*/inputRadioGroup(
          personForm("dtype"),
          options = options("dean"->"dean","student"->"student","professor"->"professor"),
          '_label -> "proffesion"
        ))),format.raw/*29.10*/("""
          
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Register new account" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*35.23*/routes/*35.29*/.Application.index())),format.raw/*35.49*/("""" class="btn">Cancel</a> 
        </div>
	""")))})),format.raw/*37.3*/("""
    
    </body>
</html>"""))}
    }
    
    def render(personForm:Form[Account]): play.api.templates.HtmlFormat.Appendable = apply(personForm)
    
    def f:((Form[Account]) => play.api.templates.HtmlFormat.Appendable) = (personForm) => apply(personForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 11 12:19:38 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/register.scala.html
                    HASH: 05d98162f76760e55965013ece5f2bff519bfa20
                    MATRIX: 784->1|913->49|945->73|1029->28|1057->47|1085->127|1236->242|1251->248|1305->280|1413->352|1428->358|1486->393|1587->458|1602->464|1642->482|1751->556|1794->590|1834->592|1896->619|1968->669|2008->674|2078->722|2118->727|2196->783|2236->788|2440->970|2656->1150|2671->1156|2713->1176|2787->1219
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|46->18|46->18|46->18|50->22|50->22|51->23|51->23|52->24|52->24|53->25|57->29|63->35|63->35|63->35|65->37
                    -- GENERATED --
                */
            