package wrappers.example.table.simple

import js.array.ReadonlyArray
import js.objects.jso
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.TableMeta
import tanstack.table.core.getCoreRowModel

internal fun <D : Any> useSimpleTable(
    data: ReadonlyArray<D>,
    columns: ReadonlyArray<ColumnDef<D, *>>,
    meta: TableMeta,
): TableInstance<D> {
    val table = useReactTable<D>(
        options = jso {
            this.data = data
            this.columns = columns
            this.meta = meta

            getCoreRowModel = getCoreRowModel()
        }
    )

    return TableInstance(table)
}
