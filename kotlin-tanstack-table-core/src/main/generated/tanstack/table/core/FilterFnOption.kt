// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface FilterFnOption<TData : RowData> /* 'auto' | BuiltInFilterFn | FilterFn<TData> */

inline fun <TData : RowData> FilterFnOption(
    source: String, /* 'auto' */
): FilterFnOption<TData> =
    source.unsafeCast<FilterFnOption<TData>>()

inline fun <TData : RowData> FilterFnOption(
    source: FilterFn<TData>,
): FilterFnOption<TData> =
    source.unsafeCast<FilterFnOption<TData>>()
