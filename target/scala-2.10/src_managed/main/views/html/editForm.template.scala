
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Course],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String, courseForm: Form[Course]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit course</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Courses.update(name))/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
        
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
            <input type="submit" value="Save this course" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Courses.list())),format.raw/*29.44*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*32.6*/("""
    
    """),_display_(Seq[Any](/*34.6*/form(routes.Courses.delete(name), 'class -> "topRight")/*34.61*/ {_display_(Seq[Any](format.raw/*34.63*/("""
        <input type="submit" value="Delete this course" class="btn danger">
    """)))})),format.raw/*36.6*/("""
    
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(name:String,courseForm:Form[Course]): play.api.templates.HtmlFormat.Appendable = apply(name,courseForm)
    
    def f:((String,Form[Course]) => play.api.templates.HtmlFormat.Appendable) = (name,courseForm) => apply(name,courseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 10 00:37:14 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/editForm.scala.html
                    HASH: 3640069d38ed7a691e44e0a1bdff2e1e559cbdc8
                    MATRIX: 790->1|932->62|964->86|1048->41|1076->60|1104->140|1142->144|1153->148|1191->150|1267->191|1309->224|1349->226|1436->277|1513->332|1563->346|1820->581|1870->595|1960->663|2183->850|2198->856|2235->871|2321->926|2367->937|2431->992|2471->994|2584->1076|2622->1083
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|49->21|50->22|50->22|57->29|57->29|57->29|60->32|62->34|62->34|62->34|64->36|66->38
                    -- GENERATED --
                */
            