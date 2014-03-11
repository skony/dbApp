
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
    """),_display_(Seq[Any](/*18.6*/if(flash.containsKey("error"))/*18.36*/ {_display_(Seq[Any](format.raw/*18.38*/("""
        <div class="alert-message warning">
            <strong>Forbidden!</strong> """),_display_(Seq[Any](/*20.42*/flash/*20.47*/.get("error"))),format.raw/*20.60*/("""
        </div>
    """)))})),format.raw/*22.6*/("""  
	"""),_display_(Seq[Any](/*23.3*/if(user == "dean")/*23.21*/{_display_(Seq[Any](format.raw/*23.22*/("""
    <div id="actions">     
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*25.48*/routes/*25.54*/.Courses.create())),format.raw/*25.71*/("""">Add a new course</a>      
    </div>
    """)))})),format.raw/*27.6*/("""
    """),_display_(Seq[Any](/*28.6*/if(user == "student")/*28.27*/{_display_(Seq[Any](format.raw/*28.28*/("""
    <div id="actions">     
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*30.48*/routes/*30.54*/.Courses.signUp())),format.raw/*30.71*/("""">Sign up to new course</a>      
    </div>
    """)))})),format.raw/*32.6*/("""
    
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    <td>Course name</td>
                    <td>Professor</td>
                    <td>Students limit</td>
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*45.18*/for(course <- courses) yield /*45.40*/ {_display_(Seq[Any](format.raw/*45.42*/("""
                    <tr>
                    	"""),_display_(Seq[Any](/*47.23*/if(user == "dean")/*47.41*/{_display_(Seq[Any](format.raw/*47.42*/("""
                        <td><a href=""""),_display_(Seq[Any](/*48.39*/routes/*48.45*/.Courses.edit(course.name))),format.raw/*48.71*/("""">"""),_display_(Seq[Any](/*48.74*/course/*48.80*/.name)),format.raw/*48.85*/("""</a></td>
                        """)))})),format.raw/*49.26*/("""
                        """),_display_(Seq[Any](/*50.26*/if(user == "professor" || user == "student")/*50.70*/{_display_(Seq[Any](format.raw/*50.71*/("""
                        <td>"""),_display_(Seq[Any](/*51.30*/course/*51.36*/.name)),format.raw/*51.41*/("""</td>
                        """)))})),format.raw/*52.26*/("""
                        <td>
                                """),_display_(Seq[Any](/*54.34*/course/*54.40*/.professor.name)),format.raw/*54.55*/("""
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*57.34*/course/*57.40*/.students_limit)),format.raw/*57.55*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*60.18*/("""

            </tbody>
        </table>
        
    
        
""")))})),format.raw/*67.2*/("""

            """))}
    }
    
    def render(courses:List[Course],user:String): play.api.templates.HtmlFormat.Appendable = apply(courses,user)
    
    def f:((List[Course],String) => play.api.templates.HtmlFormat.Appendable) = (courses,user) => apply(courses,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Mar 11 09:01:32 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/list.scala.html
                    HASH: 362f04e2eb88cf0ff5fe4928b7d33a9b9160d31f
                    MATRIX: 786->1|900->150|913->156|1023->186|1075->203|1086->206|1124->223|1177->38|1206->148|1233->237|1271->240|1283->244|1322->246|1364->253|1405->285|1445->287|1562->368|1576->373|1613->388|1665->409|1706->415|1745->445|1785->447|1907->533|1921->538|1956->551|2008->572|2048->577|2075->595|2114->596|2226->672|2241->678|2280->695|2356->740|2397->746|2427->767|2466->768|2578->844|2593->850|2632->867|2713->917|3058->1226|3096->1248|3136->1250|3220->1298|3247->1316|3286->1317|3361->1356|3376->1362|3424->1388|3463->1391|3478->1397|3505->1402|3572->1437|3634->1463|3687->1507|3726->1508|3792->1538|3807->1544|3834->1549|3897->1580|3996->1643|4011->1649|4048->1664|4177->1757|4192->1763|4229->1778|4335->1852|4430->1916
                    LINES: 26->1|28->6|28->6|30->6|31->7|31->7|31->7|34->1|36->5|37->9|39->11|39->11|39->11|41->13|41->13|41->13|43->15|43->15|43->15|45->17|46->18|46->18|46->18|48->20|48->20|48->20|50->22|51->23|51->23|51->23|53->25|53->25|53->25|55->27|56->28|56->28|56->28|58->30|58->30|58->30|60->32|73->45|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|82->54|82->54|82->54|85->57|85->57|85->57|88->60|95->67
                    -- GENERATED --
                */
            