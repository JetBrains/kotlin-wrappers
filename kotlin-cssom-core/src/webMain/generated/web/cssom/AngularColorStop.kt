// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface AngularColorStop

inline fun stop(
    color: Color,
    value: Angle,
): AngularColorStop =
    unsafeCast("$color $value")

inline fun stop(
    color: Color,
    from: Angle,
    to: Angle,
): AngularColorStop =
    unsafeCast("$color $from $to")
