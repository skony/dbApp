
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>E-studia</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*14.27*/routes/*14.33*/.Application.index())),format.raw/*14.53*/("""">
                    Data base application &mdash; E-university
                </a>
                <a href=""""),_display_(Seq[Any](/*17.27*/routes/*17.33*/.Application.logout())),format.raw/*17.54*/("""">
                	Logout
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*24.14*/content)),format.raw/*24.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 11 11:04:34 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/main.scala.html
                    HASH: 02d2a8b7aaa6762ae66e4e5285e7060a43069b07
                    MATRIX: 771->1|880->16|1052->153|1066->159|1131->202|1239->275|1253->281|1309->315|1469->439|1484->445|1526->465|1675->578|1690->584|1733->605|1903->739|1932->746
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|45->17|45->17|45->17|52->24|52->24
                    -- GENERATED --
                */
            