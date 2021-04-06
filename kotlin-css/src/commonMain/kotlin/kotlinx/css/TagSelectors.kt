package kotlinx.css

import kotlin.reflect.KProperty

/* HTML elements according to https://developer.mozilla.org/en-US/docs/Web/HTML/Element */

class TagSelector(val tagName: String)

private object TagSelectorFactory {
    operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>
    ): TagSelector =
        TagSelector(property.name)
}

/* Main root */
val html by TagSelectorFactory

/* Document metadata */
val base by TagSelectorFactory
val head by TagSelectorFactory
val link by TagSelectorFactory
val meta by TagSelectorFactory
val style by TagSelectorFactory
val title by TagSelectorFactory

/* Sectioning root */
val body by TagSelectorFactory

/* Content sectioning */
val address by TagSelectorFactory
val article by TagSelectorFactory
val aside by TagSelectorFactory
val footer by TagSelectorFactory
val header by TagSelectorFactory
val h1 by TagSelectorFactory
val h2 by TagSelectorFactory
val h3 by TagSelectorFactory
val h4 by TagSelectorFactory
val h5 by TagSelectorFactory
val h6 by TagSelectorFactory
val main by TagSelectorFactory
val nav by TagSelectorFactory
val section by TagSelectorFactory

/* Text content */
val blockquote by TagSelectorFactory
val dd by TagSelectorFactory
val div by TagSelectorFactory
val dl by TagSelectorFactory
val dt by TagSelectorFactory
val figcaption by TagSelectorFactory
val figure by TagSelectorFactory
val hr by TagSelectorFactory
val li by TagSelectorFactory
val ol by TagSelectorFactory
val p by TagSelectorFactory
val pre by TagSelectorFactory
val ul by TagSelectorFactory

/* Inline text semantics */
val a by TagSelectorFactory
val abbr by TagSelectorFactory
val b by TagSelectorFactory
val bdi by TagSelectorFactory
val bdo by TagSelectorFactory
val br by TagSelectorFactory
val cite by TagSelectorFactory
val code by TagSelectorFactory
val data by TagSelectorFactory
val dfn by TagSelectorFactory
val em by TagSelectorFactory
val i by TagSelectorFactory
val kbd by TagSelectorFactory
val mark by TagSelectorFactory
val q by TagSelectorFactory
val rb by TagSelectorFactory
val rp by TagSelectorFactory
val rt by TagSelectorFactory
val rtc by TagSelectorFactory
val ruby by TagSelectorFactory
val s by TagSelectorFactory
val samp by TagSelectorFactory
val small by TagSelectorFactory
val span by TagSelectorFactory
val strong by TagSelectorFactory
val sub by TagSelectorFactory
val sup by TagSelectorFactory
val time by TagSelectorFactory
val u by TagSelectorFactory
val varTag get() = TagSelector("var")
val wbr by TagSelectorFactory

/* Image and multimedia */
val area by TagSelectorFactory
val audio by TagSelectorFactory
val img by TagSelectorFactory
val map by TagSelectorFactory
val track by TagSelectorFactory
val video by TagSelectorFactory

/* Embedded content */
val embed by TagSelectorFactory
val iframe by TagSelectorFactory
val objectTag get() = TagSelector("object")
val param by TagSelectorFactory
val picture by TagSelectorFactory
val portal by TagSelectorFactory
val source by TagSelectorFactory

/* SVG and MathML */
val svg by TagSelectorFactory
val math by TagSelectorFactory

/* Scripting */
val canvas by TagSelectorFactory
val noscript by TagSelectorFactory
val script by TagSelectorFactory

/* Demarcating edits */
val del by TagSelectorFactory
val ins by TagSelectorFactory

/* Table content */
val caption by TagSelectorFactory
val col by TagSelectorFactory
val colgroup by TagSelectorFactory
val table by TagSelectorFactory
val tbody by TagSelectorFactory
val td by TagSelectorFactory
val tfoot by TagSelectorFactory
val th by TagSelectorFactory
val thead by TagSelectorFactory
val tr by TagSelectorFactory

/* Forms */
val button by TagSelectorFactory
val datalist by TagSelectorFactory
val fieldset by TagSelectorFactory
val form by TagSelectorFactory
val input by TagSelectorFactory
val label by TagSelectorFactory
val legend by TagSelectorFactory
val meter by TagSelectorFactory
val optgroup by TagSelectorFactory
val option by TagSelectorFactory
val output by TagSelectorFactory
val progress by TagSelectorFactory
val select by TagSelectorFactory
val textarea by TagSelectorFactory

/* Interactive elements */
val details by TagSelectorFactory
val dialog by TagSelectorFactory
val menu by TagSelectorFactory
val summary by TagSelectorFactory

/* Web Components */
val slot by TagSelectorFactory
val template by TagSelectorFactory
