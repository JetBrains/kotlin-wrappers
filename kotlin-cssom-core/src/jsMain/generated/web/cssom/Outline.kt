// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Outline {
    companion object {
        @JsValue("invert")
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
