// Automatically generated - do not modify!

package tanstack.table.core

import js.reflect.unsafeCast
import js.reflect.legacyUnsafeCast

sealed external interface AggregationFnOption<TData : RowData> /* 'auto' | keyof AggregationFns | BuiltInAggregationFn | AggregationFn<TData> */

inline fun <TData : RowData> AggregationFnOption(
    source: String, /* 'auto' */
): AggregationFnOption<TData> =
    unsafeCast(source)

inline fun <TData : RowData> AggregationFnOption(
    noinline source: AggregationFn<TData>,
): AggregationFnOption<TData> =
    legacyUnsafeCast(source)
