// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface FilterFn<TData : RowData> {
    // TODO: support invoke
    /* (row: Row<TData>, columnId: string, filterValue: any, addMeta: (meta: FilterMeta) => void): boolean */
    var autoRemove: ColumnFilterAutoRemoveTestFn<TData>?
    var resolveFilterValue: TransformFilterValueFn<TData>?
}
