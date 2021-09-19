@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Color(value: String): Color =
    value.unsafeCast<Color>()

inline fun rgb(
    red: Int,
    green: Int,
    blue: Int,
): Color =
    Color("rgb($red,$green,$blue)")

inline fun rgba(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Double,
): Color =
    Color("rgba($red,$green,$blue,$alpha)")
