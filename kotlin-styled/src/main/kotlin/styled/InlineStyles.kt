package styled

import kotlinext.js.*
import react.dom.*

@JsModule("inline-style-prefixer")
external class InlineStylePrefixer {
    fun prefix(src: dynamic): dynamic
}

private val prefixer = InlineStylePrefixer()

// Inserts vendor prefixes (using inline-style-prefixer) and sets the style attribute
fun RDOMBuilder<*>.inlineStyles(builder: StyledElement.() -> Unit) {
    val styles = StyledElement()
    builder(styles)
    setProp("style", prefixer.prefix(styles.toStyle()))
}

fun StyledElement.toStyle(): Any {
    val res = js { }
    declarations.forEach { src, v ->
        if ((v !is String) && (v !is Number)) {
            val conv = v.toString()
            res[src] = conv
        }
        else {
            res[src] = v
        }
    }
    return prefixer.prefix(res)
}
