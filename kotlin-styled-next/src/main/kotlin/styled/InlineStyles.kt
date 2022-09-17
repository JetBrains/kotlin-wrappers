package styled

import kotlinext.js.js
import kotlinx.css.CssDeclarations
import kotlinx.css.StyledElement
import kotlinx.css.hyphenize
import kotlinx.js.JsArray
import kotlinx.js.Object
import react.dom.RDOMBuilder
import react.dom.setProp

// Inserts vendor prefixes (using inline-style-prefixer) and sets the style attribute
fun RDOMBuilder<*>.inlineStyles(prefix: Boolean = true, preserveExisting: Boolean = false, builder: StyledElement.() -> Unit) {
    val newStyle = StyledElement().also(builder).toStyle(prefix)

    if (preserveExisting) {
        val existingStyle = Object.assign(js("{}"), attrs["style"])
        val style = Object.assign(existingStyle, newStyle)
        setProp("style", style)
    } else {
        setProp("style", newStyle)
    }
}

fun StyledElement.toStyle(prefix: Boolean = true): Any {
    val res = declarations.mapToObj()

    if (!prefix) {
        return res
    }

    val prefixed = prefix(res) as Object

    // https://inline-style-prefixer.js.org/docs/guides/ResolvingArrays.html
    Object.keys(prefixed).forEach {
        if (prefixed.hasOwnProperty(it)) {
            val value = prefixed.asDynamic()[it]

            if (value is JsArray) {
                // Find the unprefixed value in the array and use it: multiple values don't work for some reason
                val displayValue = value.find(js("function(element) { return !element.startsWith('-') }"))

                prefixed.asDynamic()[it] = displayValue
            }
        }
    }

    return prefixed
}

private fun CssDeclarations.mapToObj(): dynamic {
    val res = js { }
    forEach { (key, value) ->
        res[key] = when (value) {
            is String, is Number -> value
            else -> value.toString()
        }
    }
    return res
}

internal fun CssDeclarations.buildPrefixedString(indent: String = ""): String {
    val res = mapToObj()

    val prefixed = prefix(res) as Object
    return buildString {
        Object.keys(prefixed).forEach {
            val value = prefixed.asDynamic()[it]

            if (value is JsArray) {
                for (i in 0 until value.length as Int) {
                    appendLine("$indent${it.hyphenize()}: ${value[i]};")
                }
            } else {
                appendLine("$indent${it.hyphenize()}: ${value};")
            }
        }
    }
}
