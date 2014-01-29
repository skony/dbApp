
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Course],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(courseForm: Form[Course]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Add a course</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(courseForm("name"), '_label -> "Course name"))),format.raw/*15.69*/("""
            """),_display_(Seq[Any](/*16.14*/select(
                courseForm("professor.name"), 
                options(Professor.options), 
                '_label -> "Professor", '_default -> "-- Choose professor --",
                '_showConstraints -> false
            ))),format.raw/*21.14*/("""
            """),_display_(Seq[Any](/*22.14*/inputText(courseForm("students_limit"), '_label -> "Students limit"))),format.raw/*22.82*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this course" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.index())),format.raw/*29.49*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*32.6*/("""
    
""")))})))}
    }
    
    def render(courseForm:Form[Course]): play.api.templates.HtmlFormat.Appendable = apply(courseForm)
    
    def f:((Form[Course]) => play.api.templates.HtmlFormat.Appendable) = (courseForm) => apply(courseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 00:14:16 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/createForm.scala.html
                    HASH: 2e8545770246d105463f3288e0ec6cbdc3c47d68
                    MATRIX: 785->1|913->48|945->72|1029->27|1057->46|1085->126|1123->130|1134->134|1172->136|1249->178|1289->209|1329->211|1416->262|1493->317|1543->331|1800->566|1850->580|1940->648|2157->829|2172->835|2214->855|2300->910
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|49->21|50->22|50->22|57->29|57->29|57->29|60->32
                    -- GENERATED --
                */
            