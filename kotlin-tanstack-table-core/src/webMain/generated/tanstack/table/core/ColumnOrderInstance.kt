// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ColumnOrderInstance<TData : RowData> {
    /**
     * Resets the **columnOrder** state to `initialState.columnOrder`, or `true` can be passed to force a default blank state reset to `[]`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#resetcolumnorder)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    val resetColumnOrder: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.columnOrder` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-ordering#setcolumnorder)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-ordering)
     */
    val setColumnOrder: (updater: Updater<ColumnOrderState>) -> Unit
}
