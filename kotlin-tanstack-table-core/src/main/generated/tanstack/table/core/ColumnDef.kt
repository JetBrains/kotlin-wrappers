// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface ColumnDef<TData : RowData, TValue> /* DisplayColumnDef<TData, TValue> | GroupColumnDef<TData, TValue> | AccessorColumnDef<TData, TValue> */

inline fun <TData : RowData, TValue> ColumnDef(
    source: DisplayColumnDef<TData, TValue>,
): ColumnDef<TData, TValue> =
    source.unsafeCast<ColumnDef<TData, TValue>>()

inline fun <TData : RowData, TValue> ColumnDef(
    source: GroupColumnDef<TData, TValue>,
): ColumnDef<TData, TValue> =
    source.unsafeCast<ColumnDef<TData, TValue>>()

inline fun <TData : RowData, TValue> ColumnDef(
    source: AccessorColumnDef<TData, TValue>,
): ColumnDef<TData, TValue> =
    source.unsafeCast<ColumnDef<TData, TValue>>()
