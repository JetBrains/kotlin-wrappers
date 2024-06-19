// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsValue

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
