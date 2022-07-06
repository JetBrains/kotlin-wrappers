// Automatically generated - do not modify!

package tanstack.table.core

external interface FilterFn<TData : RowData> {
    // TODO: support invoke
    /* (row: Row<TData>, columnId: string, filterValue: any, addMeta: (meta: any) => void): boolean */
    var resolveFilterValue: TransformFilterValueFn<TData>?
    var autoRemove: ColumnFilterAutoRemoveTestFn<TData>?
}
