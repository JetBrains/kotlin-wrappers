@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.react.table

import react.FC
import tanstack.table.core.ColumnDefTemplate

inline fun <T : Any> ColumnDefTemplate(
    source: FC<* /* T & Props */>,
): ColumnDefTemplate<T> =
    source.unsafeCast<ColumnDefTemplate<T>>()
