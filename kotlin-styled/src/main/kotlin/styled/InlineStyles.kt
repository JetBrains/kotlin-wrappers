package styled

import kotlinext.js.*
import kotlinx.css.*
import react.dom.*

// Inserts vendor prefixes (using inline-style-prefixer) and sets the style attribute
fun RDOMBuilder<*>.inlineStyles(prefix: Boolean = true, builder: StyledElement.() -> Unit) {
    val styles = StyledElement()
    builder(styles)
    setProp("style", styles.toStyle(prefix))
}

@JsName("Array")
private external class JsArray

fun StyledElement.toStyle(prefix: Boolean = true): Any {
    val res = js { }
    declarations.forEach { (key, value) ->
        res[key] = when (value) {
            is String, is Number -> value
            else -> value.toString()
        }
    }

    if (!prefix) {
        return res
    }

    val prefixed = prefix(res) as Object

    // https://inline-style-prefixer.js.org/docs/guides/ResolvingArrays.html
    Object.keys(prefixed).forEach {
        if (prefixed.hasOwnProperty(it)) {
            @Suppress("UNUSED_VARIABLE")
            val value = prefixed.asDynamic()[it]

            @Suppress("UnsafeCastFromDynamic")
            if (value is JsArray) {
                // TODO make this work
                // val displayValue = CssInJsUtils.resolveArrayValue(it, prefixed.asDynamic()[it])

                // Find the unprefixed value in the array and use it: multiple values don't work for some reason
                val displayValue = value.find(js("function(element) { return !element.startsWith('-') }"))

                prefixed.asDynamic()[it] = displayValue
            }
        }
    }

    return prefixed
}