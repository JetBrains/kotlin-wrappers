package styled

import js.objects.Object
import js.objects.Record
import js.objects.jso
import kotlinx.css.CssDeclarations
import kotlinx.css.StyledElement
import kotlinx.css.StyledElementBuilder
import kotlinx.css.hyphenize
import react.dom.RDOMBuilder
import react.dom.setProp

// Inserts vendor prefixes (using inline-style-prefixer) and sets the style attribute
fun RDOMBuilder<*>.inlineStyles(
    prefix: Boolean = true,
    preserveExisting: Boolean = false,
    builder: StyledElementBuilder,
) {
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

    val prefixed = prefix(res)

    // https://inline-style-prefixer.js.org/docs/guides/ResolvingArrays.html
    Object.keys(prefixed).forEach {
        val value = prefixed[it]

        if (value is Array<*>) {
            // Find the unprefixed value in the array and use it: multiple values don't work for some reason
            val displayValue = value.find {
                (it as String).startsWith('-')
            }

            prefixed[it] = displayValue
        }
    }

    return prefixed
}

private fun CssDeclarations.mapToObj(): Record<String, Any> {
    val res: Record<String, Any> = jso()
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

    val prefixed = prefix(res)
    return buildString {
        Object.keys(prefixed).forEach {
            val value = prefixed[it]

            if (value is Array<*>) {
                for (i in 0 until value.size) {
                    appendLine("$indent${it.hyphenize()}: ${value[i]};")
                }
            } else {
                appendLine("$indent${it.hyphenize()}: ${value};")
            }
        }
    }
}
