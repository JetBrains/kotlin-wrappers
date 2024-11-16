// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface FilterFnOption<TData : RowData> /* 'auto' | BuiltInFilterFn | keyof FilterFns | FilterFn<TData> */

inline fun <TData : RowData> FilterFnOption(
    source: String, /* 'auto' */
): FilterFnOption<TData> =
    unsafeCast(source)

inline fun <TData : RowData> FilterFnOption(
    source: FilterFn<TData>,
): FilterFnOption<TData> =
    unsafeCast(source)
