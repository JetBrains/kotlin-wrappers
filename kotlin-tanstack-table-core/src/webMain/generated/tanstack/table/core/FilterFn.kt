// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface FilterFn<TData : RowData> {
    // TODO: support invoke
    /* (row: Row<TData>, columnId: string, filterValue: any, addMeta: (meta: FilterMeta) => void): boolean */
    val autoRemove: ColumnFilterAutoRemoveTestFn<TData>?
    val resolveFilterValue: TransformFilterValueFn<TData>?
}
