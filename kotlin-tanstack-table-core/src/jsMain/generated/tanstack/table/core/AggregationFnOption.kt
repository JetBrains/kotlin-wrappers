// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

import js.reflect.unsafeCast

sealed external interface AggregationFnOption<TData : RowData> /* 'auto' | keyof AggregationFns | BuiltInAggregationFn | AggregationFn<TData> */

inline fun <TData : RowData> AggregationFnOption(
    source: String, /* 'auto' */
): AggregationFnOption<TData> =
    unsafeCast(source)

inline fun <TData : RowData> AggregationFnOption(
    noinline source: AggregationFn<TData>,
): AggregationFnOption<TData> =
    unsafeCast(source)
