// Automatically generated - do not modify!

package tanstack.table.core

import js.array.JsTuple2
import js.collections.JsMap
import js.objects.JsPlainObject

@JsPlainObject
external interface FacetedOptions<TData : RowData> {
    var getFacetedMinMaxValues: ((table: Table<TData>, columnId: String) -> () -> JsTuple2<Int, Int>?)?
    var getFacetedRowModel: ((table: Table<TData>, columnId: String) -> () -> RowModel<TData>)?
    var getFacetedUniqueValues: ((table: Table<TData>, columnId: String) -> () -> JsMap<Any, Int>)?
}
