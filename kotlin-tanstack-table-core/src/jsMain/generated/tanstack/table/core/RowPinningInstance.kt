// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray

external interface RowPinningInstance<TData : RowData> {
    /**
     * Returns all bottom pinned rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#getbottomrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var getBottomRows: () -> ReadonlyArray<Row<TData>>

    /**
     * Returns all rows that are not pinned to the top or bottom.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#getcenterrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var getCenterRows: () -> ReadonlyArray<Row<TData>>

    /**
     * Returns whether or not any rows are pinned. Optionally specify to only check for pinned rows in either the `top` or `bottom` position.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#getissomerowspinned)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var getIsSomeRowsPinned: (position: RowPinningPosition?) -> Boolean

    /**
     * Returns all top pinned rows.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#gettoprows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var getTopRows: () -> ReadonlyArray<Row<TData>>

    /**
     * Resets the **rowPinning** state to `initialState.rowPinning`, or `true` can be passed to force a default blank state reset to `{ top: [], bottom: [], }`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#resetrowpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var resetRowPinning: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.rowPinning` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-pinning#setrowpinning)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-pinning)
     */
    var setRowPinning: (updater: Updater<RowPinningState>) -> Unit
}
