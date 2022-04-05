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

inline fun OffsetFunction(
    fn: Provider<JsPair<Int?, Int?>>,
): OffsetType =
    fn.unsafeCast<OffsetType>()
