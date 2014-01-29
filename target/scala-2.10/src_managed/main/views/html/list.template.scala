
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Course],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Course], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("course.list.title", currentPage.getTotalRowCount))),format.raw/*40.84*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Add a new course</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Course name"))),format.raw/*70.51*/("""
                    """),_display_(Seq[Any](/*71.22*/header("professor.name", "Professor"))),format.raw/*71.59*/("""
                    """),_display_(Seq[Any](/*72.22*/header("students_limit", "Students limit"))),format.raw/*72.64*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*77.18*/for(course <- currentPage.getList) yield /*77.52*/ {_display_(Seq[Any](format.raw/*77.54*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*79.39*/routes/*79.45*/.Application.edit(course.name))),format.raw/*79.75*/("""">"""),_display_(Seq[Any](/*79.78*/course/*79.84*/.name)),format.raw/*79.89*/("""</a></td>
                        <td>
                                """),_display_(Seq[Any](/*81.34*/course/*81.40*/.professor.name)),format.raw/*81.55*/("""
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*84.34*/course/*84.40*/.students_limit)),format.raw/*84.55*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*87.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*94.18*/if(currentPage.hasPrev)/*94.41*/ {_display_(Seq[Any](format.raw/*94.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*96.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*96.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*98.19*/else/*98.24*/{_display_(Seq[Any](format.raw/*98.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*102.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*104.36*/currentPage/*104.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*104.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*106.18*/if(currentPage.hasNext)/*106.41*/ {_display_(Seq[Any](format.raw/*106.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*108.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*108.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*110.19*/else/*110.24*/{_display_(Seq[Any](format.raw/*110.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*114.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*118.6*/("""
        
""")))})),format.raw/*120.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Course],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Course],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 00:14:16 CET 2014
                    SOURCE: /home/piotrek/Kodzenie/db/app/views/list.scala.html
                    HASH: 5a1ca86e3270acef24c03b2f6f0f8126fd45cfab
                    MATRIX: 816->1|1005->858|1019->864|1130->894|1183->911|1195->914|1234->931|1279->940|1313->966|1401->1030|1458->1051|1492->1063|1531->1066|1558->1071|1596->241|1607->245|2139->112|2168->239|2196->746|2226->856|2254->1087|2292->1090|2304->1094|2343->1096|2409->1126|2490->1185|2537->1197|2578->1229|2618->1231|2735->1312|2749->1317|2786->1332|2838->1353|2932->1411|2969->1426|3086->1507|3121->1520|3368->1731|3383->1737|3426->1758|3514->1811|3560->1848|3600->1850|3724->1957|3737->1962|3776->1963|3932->2083|3983->2112|4041->2134|4100->2171|4158->2193|4222->2235|4340->2317|4390->2351|4430->2353|4530->2417|4545->2423|4597->2453|4636->2456|4651->2462|4678->2467|4786->2539|4801->2545|4838->2560|4967->2653|4982->2659|5019->2674|5125->2748|5285->2872|5317->2895|5357->2897|5466->2970|5528->3010|5612->3076|5625->3081|5664->3082|5835->3220|5945->3293|5966->3304|6022->3337|6103->3381|6136->3404|6177->3406|6287->3479|6350->3519|6431->3581|6445->3586|6485->3587|6652->3721|6732->3769|6775->3780
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|103->77|103->77|103->77|105->79|105->79|105->79|105->79|105->79|105->79|107->81|107->81|107->81|110->84|110->84|110->84|113->87|120->94|120->94|120->94|122->96|122->96|124->98|124->98|124->98|128->102|130->104|130->104|130->104|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|144->118|146->120
                    -- GENERATED --
                */
            