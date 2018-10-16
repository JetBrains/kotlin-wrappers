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
fun RDOMBuilder<*>.inlineStyles(prefix: Boolean = true, builder: StyledElement.() -> Unit) {
    val styles = StyledElement()
    builder(styles)
    setProp("style", styles.toStyle(prefix))
}

fun StyledElement.toStyle(prefix: Boolean = true): Any {
    val res = js { }
    declarations.forEach {
        if ((it.value !is String) && (it.value !is Number)) {
            val conv = it.value.toString()
            res[it.key] = conv
        } else {
            res[it.key] = it.value
        }
    }

    if (!prefix) {
        return res
    }

    val prefixed = InlineStylePrefixer.prefix(res) as Object

    // https://inline-style-prefixer.js.org/docs/guides/ResolvingArrays.html
    Object.keys(prefixed).forEach {
        if (prefixed.asJsObject().hasOwnProperty(it)) {
            @Suppress("UNUSED_VARIABLE")
            val value = prefixed.asDynamic()[it]

            @Suppress("UnsafeCastFromDynamic")
            if (js("(value instanceof Array)")) {
                // TODO make this work
                // val displayValue = CssInJsUtils.resolveArrayValue(it, prefixed.asDynamic()[it])

                // Find the unprefixed value in the array and use it: multiple values don't work for some reason
                val displayValue = js("(value.find(function(element) { return !element.startsWith('-') }))")

                prefixed.asDynamic()[it] = displayValue
            }
        }
    }

    return prefixed
}
