
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Course],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(courses: List[Course]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*6.2*/header/*6.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.38*/("""
    <th class=""""),_display_(Seq[Any](/*7.17*/key/*7.20*/.replace(".","_"))),format.raw/*7.37*/(""" >
    </th>
""")))};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*5.37*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main/*11.6*/ {_display_(Seq[Any](format.raw/*11.8*/("""

    """),_display_(Seq[Any](/*13.6*/if(flash.containsKey("success"))/*13.38*/ {_display_(Seq[Any](format.raw/*13.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*15.37*/flash/*15.42*/.get("success"))),format.raw/*15.57*/("""
        </div>
    """)))})),format.raw/*17.6*/(""" 

    <div id="actions">     
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*20.48*/routes/*20.54*/.Courses.create())),format.raw/*20.71*/("""">Add a new course</a>      
    </div>
    """),format.raw/*22.5*/("""{"""),format.raw/*22.6*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*27.22*/header("name", "Course name"))),format.raw/*27.51*/("""
                    """),_display_(Seq[Any](/*28.22*/header("professor.name", "Professor"))),format.raw/*28.59*/("""
                    """),_display_(Seq[Any](/*29.22*/header("students_limit", "Students limit"))),format.raw/*29.64*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*34.18*/for(course <- courses) yield /*34.40*/ {_display_(Seq[Any](format.raw/*34.42*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*36.39*/routes/*36.45*/.Courses.edit(course.name))),format.raw/*36.71*/("""">"""),_display_(Seq[Any](/*36.74*/course/*36.80*/.name)),format.raw/*36.85*/("""</a></td>
                        <td>
                                """),_display_(Seq[Any](/*38.34*/course/*38.40*/.professor.name)),format.raw/*38.55*/("""
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*41.34*/course/*41.40*/.students_limit)),format.raw/*41.55*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*44.18*/("""

            </tbody>
        </table>
        
    """),format.raw/*49.5*/("""}"""),format.raw/*49.6*/("""
        
""")))})),format.raw/*51.2*/("""

            """))}
    }
    
    def render(courses:List[Course]): play.api.templates.HtmlFormat.Appendable = apply(courses)
    
    def f:((List[Course]) => play.api.templates.HtmlFormat.Appendable) = (courses) => apply(courses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 09 20:40:32 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/list.scala.html
                    HASH: 496cbed993df03f95dcbaf903e193b6cc99c0025
                    MATRIX: 779->1|879->136|892->142|1002->172|1054->189|1065->192|1103->209|1156->24|1185->134|1212->223|1250->226|1262->230|1301->232|1343->239|1384->271|1424->273|1541->354|1555->359|1592->374|1644->395|1758->473|1773->479|1812->496|1883->540|1911->541|2067->661|2118->690|2176->712|2235->749|2293->771|2357->813|2475->895|2513->917|2553->919|2653->983|2668->989|2716->1015|2755->1018|2770->1024|2797->1029|2905->1101|2920->1107|2957->1122|3086->1215|3101->1221|3138->1236|3244->1310|3324->1363|3352->1364|3394->1375
                    LINES: 26->1|28->6|28->6|30->6|31->7|31->7|31->7|34->1|36->5|37->9|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|45->17|48->20|48->20|48->20|50->22|50->22|55->27|55->27|56->28|56->28|57->29|57->29|62->34|62->34|62->34|64->36|64->36|64->36|64->36|64->36|64->36|66->38|66->38|66->38|69->41|69->41|69->41|72->44|77->49|77->49|79->51
                    -- GENERATED --
                */
            