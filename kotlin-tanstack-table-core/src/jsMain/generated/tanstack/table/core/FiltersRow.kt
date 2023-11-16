// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyRecord

external interface FiltersRow<TData : RowData> {
    /**
     * The column filters map for the row. This object tracks whether a row is passing/failing specific filters by their column ID.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#columnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var columnFilters: ReadonlyRecord<String, Boolean>

    /**
     * The column filters meta map for the row. This object tracks any filter meta for a row as optionally provided during the filtering process.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#columnfiltersmeta)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var columnFiltersMeta: ReadonlyRecord<String, FilterMeta>
}
