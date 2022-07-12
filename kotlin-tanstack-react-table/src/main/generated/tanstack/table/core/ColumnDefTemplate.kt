// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface ColumnDefTemplate<TProps : Any> /* string | ((props: TProps) -> any) */

inline fun <TProps : Any> ColumnDefTemplate(
    source: String,
): ColumnDefTemplate<TProps> =
    source.unsafeCast<ColumnDefTemplate<TProps>>()

inline fun <TProps : Any> ColumnDefTemplate(
    source: (props: TProps) -> Any?,
): ColumnDefTemplate<TProps> =
    source.unsafeCast<ColumnDefTemplate<TProps>>()
