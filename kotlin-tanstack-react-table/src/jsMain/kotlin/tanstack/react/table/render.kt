package tanstack.react.table

import react.ReactNode
import tanstack.table.core.Cell
import tanstack.table.core.Header
import tanstack.table.core.RowData

fun <TData : RowData, TValue> renderHeader(
    source: Header<TData, TValue>,
): ReactNode? =
    flexRender(
        Comp = source.column.columnDef.header,
        props = source.getContext(),
    )

fun <TData : RowData, TValue> renderFooter(
    source: Header<TData, TValue>,
): ReactNode? =
    flexRender(
        Comp = source.column.columnDef.footer,
        props = source.getContext(),
    )

fun <TData : RowData, TValue> renderCell(
    source: Cell<TData, TValue>,
): ReactNode? =
    flexRender(
        Comp = source.column.columnDef.cell,
        props = source.getContext(),
    )
