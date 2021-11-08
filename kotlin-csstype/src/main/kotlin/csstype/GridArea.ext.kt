@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun GridArea(
    value: String,
): GridArea =
    value.unsafeCast<GridArea>()
