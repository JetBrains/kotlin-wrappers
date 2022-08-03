// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface ColumnIdentifiers<TData : RowData, TValue> /* IdIdentifier<TData, TValue> | StringHeaderIdentifier */

inline fun <TData : RowData, TValue> ColumnIdentifiers(
    source: IdIdentifier<TData, TValue>,
): ColumnIdentifiers<TData, TValue> =
    source.unsafeCast<ColumnIdentifiers<TData, TValue>>()

inline fun <TData : RowData, TValue> ColumnIdentifiers(
    source: StringHeaderIdentifier,
): ColumnIdentifiers<TData, TValue> =
    source.unsafeCast<ColumnIdentifiers<TData, TValue>>()
