@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Padding(value: String): Padding =
    value.unsafeCast<Padding>()

inline fun Properties.padding(
    vertical: AutoLengthProperty,
    horizontal: AutoLengthProperty,
) {
    padding = Padding("$vertical $horizontal")
}

inline fun Properties.padding(
    top: AutoLengthProperty,
    horizontal: AutoLengthProperty,
    bottom: AutoLengthProperty,
) {
    padding = Padding("$top $horizontal $bottom")
}

inline fun Properties.padding(
    top: AutoLengthProperty,
    right: AutoLengthProperty,
    bottom: AutoLengthProperty,
    left: AutoLengthProperty,
) {
    padding = Padding("$top $right $bottom $left")
}
