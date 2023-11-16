// Automatically generated - do not modify!

package tanstack.table.core

external interface CoreCell<TData : RowData, TValue> {
    /**
     * The associated Column object for the cell.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#column)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var column: Column<TData, TValue>

    /**
     * Returns the rendering context (or props) for cell-based components like cells and aggregated cells. Use these props with your framework's `flexRender` utility to render these using the template of your choice:
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#getcontext)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var getContext: () -> CellContext<TData, TValue>

    /**
     * Returns the value for the cell, accessed via the associated column's accessor key or accessor function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#getvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var getValue: Getter<TValue> /* CellContext<TData, TValue>['getValue'] */

    /**
     * The unique ID for the cell across the entire table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#id)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var id: String

    /**
     * Renders the value for a cell the same as `getValue`, but will return the `renderFallbackValue` if no value is found.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#rendervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var renderValue: Getter<TValue?> /* CellContext<TData, TValue>['renderValue'] */

    /**
     * The associated Row object for the cell.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/cell#row)
     * [Guide](https://tanstack.com/table/v8/docs/guide/cells)
     */
    var row: Row<TData>
}
