@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Margin(value: String): Margin =
    value.unsafeCast<Margin>()

inline fun Properties.margin(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
) {
    margin = Margin("$vertical $horizontal")
}

inline fun Properties.margin(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
) {
    margin = Margin("$top $horizontal $bottom")
}

inline fun Properties.margin(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
) {
    margin = Margin("$top $right $bottom $left")
}
