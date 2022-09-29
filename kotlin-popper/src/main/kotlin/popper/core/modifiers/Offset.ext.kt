@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import kotlinx.js.JsTuple2
import kotlinx.js.tupleOf

inline fun Offset(
    x: Double?,
    y: Double?,
): OffsetType =
    tupleOf(x, y)
        .unsafeCast<OffsetType>()

inline fun OffsetFunction(
    noinline fn: Provider<JsTuple2<Int?, Int?>>,
): OffsetType =
    fn.unsafeCast<OffsetType>()
