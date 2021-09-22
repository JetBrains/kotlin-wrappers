@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Margin(value: String): Margin =
    value.unsafeCast<Margin>()

inline fun Properties.margin(
    vertical: Length,
    horizontal: Length,
) {
    margin = Margin("$vertical $horizontal")
}

inline fun Properties.margin(
    top: Length,
    horizontal: Length,
    bottom: Length,
) {
    margin = Margin("$top $horizontal $bottom")
}

inline fun Properties.margin(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
) {
    margin = Margin("$top $right $bottom $left")
}
