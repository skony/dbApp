
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Course],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(courses: List[Course], user: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*6.2*/header/*6.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.38*/("""
    <th class=""""),_display_(Seq[Any](/*7.17*/key/*7.20*/.replace(".","_"))),format.raw/*7.37*/(""" >
    </th>
""")))};
Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*5.37*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main/*11.6*/ {_display_(Seq[Any](format.raw/*11.8*/("""

    """),_display_(Seq[Any](/*13.6*/if(flash.containsKey("success"))/*13.38*/ {_display_(Seq[Any](format.raw/*13.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*15.37*/flash/*15.42*/.get("success"))),format.raw/*15.57*/("""
        </div>
    """)))})),format.raw/*17.6*/(""" 
	"""),_display_(Seq[Any](/*18.3*/if(user == "dean")/*18.21*/{_display_(Seq[Any](format.raw/*18.22*/("""
    <div id="actions">     
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*20.48*/routes/*20.54*/.Courses.create())),format.raw/*20.71*/("""">Add a new course</a>      
    </div>
    """)))})),format.raw/*22.6*/("""
    
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    <td>Course name</td>
                    <td>Professor</td>
                    <td>Students limit</td>
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*35.18*/for(course <- courses) yield /*35.40*/ {_display_(Seq[Any](format.raw/*35.42*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*37.39*/routes/*37.45*/.Courses.edit(course.name))),format.raw/*37.71*/("""">"""),_display_(Seq[Any](/*37.74*/course/*37.80*/.name)),format.raw/*37.85*/("""</a></td>
                        <td>
                                """),_display_(Seq[Any](/*39.34*/course/*39.40*/.professor.name)),format.raw/*39.55*/("""
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*42.34*/course/*42.40*/.students_limit)),format.raw/*42.55*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*45.18*/("""

            </tbody>
        </table>
        
    
        
""")))})),format.raw/*52.2*/("""

            """))}
    }
    
    def render(courses:List[Course],user:String): play.api.templates.HtmlFormat.Appendable = apply(courses,user)
    
    def f:((List[Course],String) => play.api.templates.HtmlFormat.Appendable) = (courses,user) => apply(courses,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 09 22:54:34 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/list.scala.html
                    HASH: 43e567497f861bc465d3a2ed815ac295541b7882
                    MATRIX: 786->1|900->150|913->156|1023->186|1075->203|1086->206|1124->223|1177->38|1206->148|1233->237|1271->240|1283->244|1322->246|1364->253|1405->285|1445->287|1562->368|1576->373|1613->388|1665->409|1704->413|1731->431|1770->432|1882->508|1897->514|1936->531|2012->576|2357->885|2395->907|2435->909|2535->973|2550->979|2598->1005|2637->1008|2652->1014|2679->1019|2787->1091|2802->1097|2839->1112|2968->1205|2983->1211|3020->1226|3126->1300|3221->1364
                    LINES: 26->1|28->6|28->6|30->6|31->7|31->7|31->7|34->1|36->5|37->9|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|45->17|46->18|46->18|46->18|48->20|48->20|48->20|50->22|63->35|63->35|63->35|65->37|65->37|65->37|65->37|65->37|65->37|67->39|67->39|67->39|70->42|70->42|70->42|73->45|80->52
                    -- GENERATED --
                */
            