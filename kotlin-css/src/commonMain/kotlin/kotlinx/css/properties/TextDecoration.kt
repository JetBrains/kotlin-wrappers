@file:Suppress("EnumEntryName")

package kotlinx.css.properties

import kotlinx.css.Color
import kotlinx.css.hyphenize

enum class TextDecorationLine {
    initial, inherit, unset,

    underline, overline, lineThrough;

    override fun toString() = name.hyphenize()
}

enum class TextDecorationStyle {
    initial, inherit, unset,

    solid, double, dotted, dashed, wavy;

    override fun toString() = name
}


class TextDecoration(
    private val lines: Set<TextDecorationLine>,
    val style: TextDecorationStyle? = null,
    val color: Color? = null,
) {
    companion object {
        val none = TextDecoration(setOf())
    }

    override fun toString() = when {
        lines.isEmpty() -> "none"
        else -> buildString {
            append(lines.joinToString(" "))
            style?.let { append(" $it") }
            color?.let { append(" $it") }
        }
    }
}
