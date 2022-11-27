@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import js.core.JsTuple2
import js.core.tupleOf

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
