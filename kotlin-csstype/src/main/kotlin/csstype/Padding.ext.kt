@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun Padding(value: String): Padding =
    value.unsafeCast<Padding>()

inline fun Properties.padding(
    vertical: Length,
    horizontal: Length,
) {
    padding = Padding("$vertical $horizontal")
}

inline fun Properties.padding(
    top: Length,
    horizontal: Length,
    bottom: Length,
) {
    padding = Padding("$top $horizontal $bottom")
}

inline fun Properties.padding(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
) {
    padding = Padding("$top $right $bottom $left")
}
