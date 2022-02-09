@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinx.js.ReadonlyArray

external val useColumnOrder: PluginHook<Any>

external interface UseColumnOrderState<D : Any> {
    var columnOrder: ReadonlyArray<IdType<D>>
}

external interface UseColumnOrderInstanceProps<D : Any> {
    fun setColumnOrder(ids: ReadonlyArray<IdType<D>>)
    fun setColumnOrder(updater: (ReadonlyArray<IdType<D>>) -> ReadonlyArray<IdType<D>>)
}
