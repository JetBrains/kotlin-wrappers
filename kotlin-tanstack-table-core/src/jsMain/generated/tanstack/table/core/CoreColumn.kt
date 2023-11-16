// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreColumn<TData : RowData, TValue> {
    /**
     * The resolved accessor function to use when extracting the value for the column from each row. Will only be defined if the column def has a valid accessor key or function defined.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#accessorfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var accessorFn: AccessorFn<TData, TValue>?

    /**
     * The original column def used to create the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#columndef)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var columnDef: ColumnDef<TData, TValue>

    /**
     * The child column (if the column is a group column). Will be an empty array if the column is not a group column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#columns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var columns: ReadonlyArray<Column<TData, TValue>>

    /**
     * The depth of the column (if grouped) relative to the root column def array.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#depth)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var depth: Int

    /**
     * Returns the flattened array of this column and all child/grand-child columns for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#getflatcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var getFlatColumns: () -> ReadonlyArray<Column<TData, TValue>>

    /**
     * Returns an array of all leaf-node columns for this column. If a column has no children, it is considered the only leaf-node column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#getleafcolumns)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var getLeafColumns: () -> ReadonlyArray<Column<TData, TValue>>

    /**
     * The resolved unique identifier for the column resolved in this priority:
    - A manual `id` property from the column def
    - The accessor key from the column def
    - The header string from the column def
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#id)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var id: String

    /**
     * The parent column for this column. Will be undefined if this is a root column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/column#parent)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-defs)
     */
    var parent: Column<TData, TValue>?
}
