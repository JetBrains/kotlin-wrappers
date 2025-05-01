// Automatically generated - do not modify!

package tanstack.table.core

import js.array.Tuple2
import js.collections.JsMap
import js.objects.JsPlainObject

@JsPlainObject
external interface FacetedOptions<TData : RowData> {
    val getFacetedMinMaxValues: ((table: Table<TData>, columnId: String) -> () -> Tuple2<Int, Int>?)?
    val getFacetedRowModel: ((table: Table<TData>, columnId: String) -> () -> RowModel<TData>)?
    val getFacetedUniqueValues: ((table: Table<TData>, columnId: String) -> () -> JsMap<Any, Int>)?
}
