// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface SortingFnOption<TData : RowData> /* 'auto' | keyof SortingFns | BuiltInSortingFn | SortingFn<TData> */

inline fun <TData : RowData> SortingFnOption(
    source: String, /* 'auto' */
): SortingFnOption<TData> =
    source.unsafeCast<SortingFnOption<TData>>()

inline fun <TData : RowData> SortingFnOption(
    source: SortingFn<TData>,
): SortingFnOption<TData> =
    source.unsafeCast<SortingFnOption<TData>>()
