// Automatically generated - do not modify!

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface ColumnDefTemplate<TProps : Any> /* string | ((props: TProps) -> any) */

inline fun <TProps : Any> ColumnDefTemplate(
    source: String,
): ColumnDefTemplate<TProps> =
    unsafeCast(source)

inline fun <TProps : Any> ColumnDefTemplate(
    noinline source: (props: TProps) -> Any?,
): ColumnDefTemplate<TProps> =
    unsafeCast(source)
