// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface Gradient :
    Image

inline fun linearGradient(
    vararg stops: LinearColorStop,
): Gradient =
    "linear-gradient($stops)".unsafeCast<Gradient>()

inline fun linearGradient(
    angle: Angle,
    vararg stops: LinearColorStop,
): Gradient =
    "linear-gradient($angle,$stops)".unsafeCast<Gradient>()

inline fun repeatingLinearGradient(
    vararg stops: LinearColorStop,
): Gradient =
    "repeating-linear-gradient($stops)".unsafeCast<Gradient>()

inline fun repeatingLinearGradient(
    angle: Angle,
    vararg stops: LinearColorStop,
): Gradient =
    "repeating-linear-gradient($angle,$stops)".unsafeCast<Gradient>()
