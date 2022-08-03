// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.table.core

sealed external interface AccessorColumnDef<TData : RowData, TValue> /* AccessorKeyColumnDef<TData, TValue> | AccessorFnColumnDef<TData, TValue> */

inline fun <TData : RowData, TValue> AccessorColumnDef(
    source: AccessorKeyColumnDef<TData, TValue>,
): AccessorColumnDef<TData, TValue> =
    source.unsafeCast<AccessorColumnDef<TData, TValue>>()

inline fun <TData : RowData, TValue> AccessorColumnDef(
    source: AccessorFnColumnDef<TData, TValue>,
): AccessorColumnDef<TData, TValue> =
    source.unsafeCast<AccessorColumnDef<TData, TValue>>()
