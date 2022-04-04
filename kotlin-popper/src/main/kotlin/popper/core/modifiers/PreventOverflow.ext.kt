@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

inline fun TetherOffset(
    x: Double,
): TetherOffsetType =
    x.unsafeCast<TetherOffsetType>()

inline fun TetherOffset(
    fn: Provider<Double>,
): TetherOffsetType =
    fn.unsafeCast<TetherOffsetType>()
