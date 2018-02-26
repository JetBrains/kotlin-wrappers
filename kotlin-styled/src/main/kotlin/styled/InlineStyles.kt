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
    declarations.forEach {
        if ((it.value !is String) && (it.value !is Number)) {
            val conv = it.value.toString()
            res[it.key] = conv
        }
        else {
            res[it.key] = it.value
        }
    }
    return prefixer.prefix(res)
}
