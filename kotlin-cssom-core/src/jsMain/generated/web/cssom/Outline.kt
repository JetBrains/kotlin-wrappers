// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast
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
    unsafeCast("$width $style")

inline fun Outline(
    width: Length,
    style: LineStyle,
    color: Color,
): Outline =
    unsafeCast("$width $style $color")
