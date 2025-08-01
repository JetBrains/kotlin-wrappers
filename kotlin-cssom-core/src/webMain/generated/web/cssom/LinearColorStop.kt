// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface LinearColorStop

inline fun stop(
    color: Color,
    value: Length,
): LinearColorStop =
    unsafeCast("$color $value")

inline fun stop(
    color: Color,
    from: Length,
    to: Length,
): LinearColorStop =
    unsafeCast("$color $from $to")
