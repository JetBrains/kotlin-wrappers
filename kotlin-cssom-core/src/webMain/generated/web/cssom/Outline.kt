// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Outline

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
