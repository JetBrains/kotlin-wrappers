// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface CoreOptionsResolved<TData : RowData> :
    CoreOptions<TData> {
    /**
     * The `onStateChange` option can be used to optionally listen to state changes within the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#onstatechange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var onStateChange: (updater: Updater<TableState>) -> Unit

    /**
     * Value used when the desired value is not found in the data.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#renderfallbackvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var renderFallbackValue: Any?

    /**
     * The `state` option can be used to optionally _control_ part or all of the table state. The state you pass here will merge with and overwrite the internal automatically-managed state to produce the final state for the table. You can also listen to state changes via the `onStateChange` option.
     * > Note: Any state passed in here will override both the internal state and any other `initialState` you provide.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/table#state)
     * [Guide](https://tanstack.com/table/v8/docs/guide/tables)
     */
    var state: TableState /* Partial */
}
