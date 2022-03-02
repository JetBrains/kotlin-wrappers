@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import kotlinx.js.JsPair
import popper.core.Placement
import popper.core.Rect

external interface IOffset

inline fun Offset(
    x: Double?,
    y: Double?,
): IOffset =
    JsPair(x, y)
        .unsafeCast<IOffset>()

inline fun Offset(
    fn: OffsetsFunction,
): IOffset =
    fn.unsafeCast<IOffset>()

external interface OffsetsFunctionOptions {
    val popper: Rect
    val reference: Rect
    val placement: Placement
}

typealias OffsetsFunction = (
    options: OffsetsFunctionOptions,
) -> JsPair<Int?, Int?>
