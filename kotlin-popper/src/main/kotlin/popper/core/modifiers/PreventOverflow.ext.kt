@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

inline fun TetherOffset(
    x: Double,
): TetherOffsetType =
    x.unsafeCast<TetherOffsetType>()

inline fun TetherOffset(
    fn: TetherOffsetFunction,
): TetherOffsetType =
    fn.unsafeCast<TetherOffsetType>()

typealias TetherOffsetFunction = (
    options: OffsetsFunctionOptions,
) -> Double
