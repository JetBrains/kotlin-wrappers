package example.components.table.base

import js.array.ReadonlyArray
import react.useMemo
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.TableMeta
import tanstack.table.core.TableOptions
import tanstack.table.core.getCoreRowModel

internal fun <D : Any> useTable(
    data: ReadonlyArray<D>,
    columns: ReadonlyArray<ColumnDef<D, *>>,
    meta: TableMeta,
    settings: TableSettings<D>? = null,
): TableInstance<D> {
    val table = useReactTable(
        options = TableOptions(
            data = data,
            columns = columns,
            meta = meta,
            getCoreRowModel = getCoreRowModel(),
            getRowId = settings?.getRowId,
        ),
    )

    return useMemo(table) {
        TableInstance(table)
    }
}
