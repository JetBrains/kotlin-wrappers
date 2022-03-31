@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import kotlinx.js.JsPair

inline fun Offset(
    x: Double?,
    y: Double?,
): OffsetType =
    JsPair(x, y)
        .unsafeCast<OffsetType>()

inline fun Offset(
    fn: OffsetsFunction,
): OffsetType =
    fn.unsafeCast<OffsetType>()

typealias OffsetsFunction = (
    options: OffsetsFunctionOptions,
) -> JsPair<Int?, Int?>
