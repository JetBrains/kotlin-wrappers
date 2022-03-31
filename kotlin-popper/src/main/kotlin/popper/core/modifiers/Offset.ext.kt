@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import kotlinx.js.JsPair
import popper.core.Placement
import popper.core.Rect

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

external interface OffsetsFunctionOptions {
    val popper: Rect
    val reference: Rect
    val placement: Placement
}

typealias OffsetsFunction = (
    options: OffsetsFunctionOptions,
) -> JsPair<Int?, Int?>
