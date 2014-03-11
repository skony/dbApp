
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
object signUpForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Course],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(courses: List[Course]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
	
	<h1>Sign up to new course</h1>
	
	
		"""),_display_(Seq[Any](/*12.4*/for(course <- courses) yield /*12.26*/{_display_(Seq[Any](format.raw/*12.27*/("""
			"""),_display_(Seq[Any](/*13.5*/course/*13.11*/.name)),format.raw/*13.16*/("""
			"""),_display_(Seq[Any](/*14.5*/course/*14.11*/.professor.name)),format.raw/*14.26*/("""
			"""),_display_(Seq[Any](/*15.5*/course/*15.11*/.students_limit)),format.raw/*15.26*/("""
	
			<div class="actions">
	            <a href=""""),_display_(Seq[Any](/*18.24*/routes/*18.30*/.Courses.addParticipant(course.name))),format.raw/*18.66*/("""" class="btn">Sign up for this course</a> 
	        </div>
	
		""")))})),format.raw/*21.4*/("""
		<a href=""""),_display_(Seq[Any](/*22.13*/routes/*22.19*/.Application.index())),format.raw/*22.39*/("""" class="btn">Cancel</a> 
""")))})))}
    }
    
    def render(courses:List[Course]): play.api.templates.HtmlFormat.Appendable = apply(courses)
    
    def f:((List[Course]) => play.api.templates.HtmlFormat.Appendable) = (courses) => apply(courses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 10 23:45:32 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/signUpForm.scala.html
                    HASH: 57992532e1841a894232ed694aebbf5cb8042036
                    MATRIX: 785->1|910->45|942->69|1026->24|1054->43|1082->123|1119->126|1130->130|1167->131|1244->173|1282->195|1321->196|1361->201|1376->207|1403->212|1443->217|1458->223|1495->238|1535->243|1550->249|1587->264|1674->315|1689->321|1747->357|1842->421|1891->434|1906->440|1948->460
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|46->18|49->21|50->22|50->22|50->22
                    -- GENERATED --
                */
            