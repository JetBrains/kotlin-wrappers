// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface SortingFnOption<TData : RowData> /* 'auto' | keyof SortingFns | BuiltInSortingFn | SortingFn<TData> */

inline fun <TData : RowData> SortingFnOption(
    source: String, /* 'auto' */
): SortingFnOption<TData> =
    unsafeCast(source)

inline fun <TData : RowData> SortingFnOption(
    source: SortingFn<TData>,
): SortingFnOption<TData> =
    unsafeCast(source)
