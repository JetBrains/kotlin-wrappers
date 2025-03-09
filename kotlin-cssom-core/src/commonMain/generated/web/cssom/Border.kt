// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Border

inline fun Border(
    width: Length,
    style: LineStyle,
): Border =
    unsafeCast("$width $style")

inline fun Border(
    width: Length,
    style: LineStyle,
    color: Color,
): Border =
    unsafeCast("$width $style $color")
