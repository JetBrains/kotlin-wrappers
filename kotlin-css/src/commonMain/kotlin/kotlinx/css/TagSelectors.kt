package kotlinx.css

import kotlin.reflect.KProperty

class TagSelector(val tagName: String)

private object TagSelectorFactory {
    operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>
    ): TagSelector =
        TagSelector(property.name)
}

val a by TagSelectorFactory
val abbr by TagSelectorFactory
val area by TagSelectorFactory
val address by TagSelectorFactory
val article by TagSelectorFactory
val aside by TagSelectorFactory
val audio by TagSelectorFactory

val b by TagSelectorFactory
val bdi by TagSelectorFactory
val blockquote by TagSelectorFactory
val bdo by TagSelectorFactory
val body by TagSelectorFactory
val br by TagSelectorFactory
val button by TagSelectorFactory

val canvas by TagSelectorFactory
val caption by TagSelectorFactory
val cite by TagSelectorFactory
val code by TagSelectorFactory
val col by TagSelectorFactory
val colgroup by TagSelectorFactory
val command by TagSelectorFactory

val datalist by TagSelectorFactory
val del by TagSelectorFactory
val details by TagSelectorFactory
val dfn by TagSelectorFactory
val dialog by TagSelectorFactory
val div by TagSelectorFactory
val dl by TagSelectorFactory

val em by TagSelectorFactory
val embed by TagSelectorFactory

val fieldset by TagSelectorFactory
val figure by TagSelectorFactory
val figcaption by TagSelectorFactory
val footer by TagSelectorFactory
val form by TagSelectorFactory

val h1 by TagSelectorFactory
val h2 by TagSelectorFactory
val h3 by TagSelectorFactory
val h4 by TagSelectorFactory
val h5 by TagSelectorFactory
val h6 by TagSelectorFactory
val header by TagSelectorFactory
val hgroup by TagSelectorFactory
val hr by TagSelectorFactory
val html by TagSelectorFactory

val i by TagSelectorFactory
val iframe by TagSelectorFactory
val img by TagSelectorFactory
val input by TagSelectorFactory
val ins by TagSelectorFactory

val kbd by TagSelectorFactory
val keygen by TagSelectorFactory

val label by TagSelectorFactory
val link by TagSelectorFactory
val li by TagSelectorFactory

val map by TagSelectorFactory
val mark by TagSelectorFactory
val math by TagSelectorFactory
val menu by TagSelectorFactory
val meta by TagSelectorFactory
val meter by TagSelectorFactory

val nav by TagSelectorFactory
val noscript by TagSelectorFactory

val ol by TagSelectorFactory
val objectTag by TagSelectorFactory
val output by TagSelectorFactory

val p by TagSelectorFactory
val pre by TagSelectorFactory
val progress by TagSelectorFactory

val q by TagSelectorFactory

val ruby by TagSelectorFactory

val samp by TagSelectorFactory
val script by TagSelectorFactory
val section by TagSelectorFactory
val select by TagSelectorFactory
val small by TagSelectorFactory
val span by TagSelectorFactory
val strong by TagSelectorFactory
val style by TagSelectorFactory
val sub by TagSelectorFactory
val sup by TagSelectorFactory
val svg by TagSelectorFactory

val table by TagSelectorFactory
val tbody by TagSelectorFactory
val td by TagSelectorFactory
val textarea by TagSelectorFactory
val tfoot by TagSelectorFactory
val th by TagSelectorFactory
val thead by TagSelectorFactory
val time by TagSelectorFactory
val tr by TagSelectorFactory

val ul by TagSelectorFactory

val varTag get() = TagSelector("var")
val video by TagSelectorFactory
