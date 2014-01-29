
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
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(name))/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""
        
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
            <a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.list())),format.raw/*29.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*32.6*/("""
    
    """),_display_(Seq[Any](/*34.6*/form(routes.Application.delete(name), 'class -> "topRight")/*34.65*/ {_display_(Seq[Any](format.raw/*34.67*/("""
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
                    DATE: Thu Jan 30 00:14:16 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/editForm.scala.html
                    HASH: ac386b7212bf8a705d50736126cf33e0f879611e
                    MATRIX: 790->1|932->62|964->86|1048->41|1076->60|1104->140|1142->144|1153->148|1191->150|1267->191|1313->228|1353->230|1440->281|1517->336|1567->350|1824->585|1874->599|1964->667|2187->854|2202->860|2243->879|2329->934|2375->945|2443->1004|2483->1006|2596->1088|2634->1095
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|49->21|50->22|50->22|57->29|57->29|57->29|60->32|62->34|62->34|62->34|64->36|66->38
                    -- GENERATED --
                */
            