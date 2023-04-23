// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface AngularColorStop

inline fun stop(
    color: Color,
    value: Angle,
): AngularColorStop =
    "$color $value".unsafeCast<AngularColorStop>()

inline fun stop(
    color: Color,
    from: Angle,
    to: Angle,
): AngularColorStop =
    "$color $from $to".unsafeCast<AngularColorStop>()
