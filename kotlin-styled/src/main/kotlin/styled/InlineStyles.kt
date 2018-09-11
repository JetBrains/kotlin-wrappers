package styled

import kotlinext.js.*
import kotlinx.css.*
import react.dom.*

@JsModule("inline-style-prefixer")
external object InlineStylePrefixer {
    /**
     * https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/prefix.md
     *
     * data: an object containing a valid prefixMap and a plugins list
     * Returns: custom prefix function
     */
    fun createPrefixer(data: dynamic): dynamic

    /**
     * https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/createPrefixer.md
     *
     * style: an object containing valid style declarations
     * Returns: an object containing all style declarations with vendor prefixes
     */
    fun prefix(style: dynamic): dynamic
}

// Inserts vendor prefixes (using inline-style-prefixer) and sets the style attribute
fun RDOMBuilder<*>.inlineStyles(builder: StyledElement.() -> Unit) {
    val styles = StyledElement()
    builder(styles)
    setProp("style", InlineStylePrefixer.prefix(styles.toStyle()))
}

fun StyledElement.toStyle(): Any {
    val res = js { }
    declarations.forEach {
        if ((it.value !is String) && (it.value !is Number)) {
            val conv = it.value.toString()
            res[it.key] = conv
        } else {
            res[it.key] = it.value
        }
    }
    return InlineStylePrefixer.prefix(res)
}
