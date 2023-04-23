// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package web.cssom

// language=JavaScript
@JsName("""(/*union*/{invert: 'invert'}/*union*/)""")
sealed external interface Outline {
    companion object {
        val invert: Outline
    }
}

inline fun Outline(
    width: Length,
    style: LineStyle,
): Outline =
    "$width $style".unsafeCast<Outline>()

inline fun Outline(
    width: Length,
    style: LineStyle,
    color: Color,
): Outline =
    "$width $style $color".unsafeCast<Outline>()
