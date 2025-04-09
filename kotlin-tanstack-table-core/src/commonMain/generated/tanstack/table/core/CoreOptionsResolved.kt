// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface CoreOptionsResolved<TData : RowData> :
    CoreOptions<TData> {
    override val onStateChange: (updater: Updater<TableState>) -> Unit
    override val renderFallbackValue: Any?
    override val state: TableState /* Partial */
}
