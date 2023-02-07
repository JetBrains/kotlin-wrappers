// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Color(
    value: String,
): Color =
    value.unsafeCast<Color>()

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
): Color =
    "rgb($red,$green,$blue)".unsafeCast<Color>()

inline fun rgba(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Double,
): Color =
    "rgba($red,$green,$blue,$alpha)".unsafeCast<Color>()
