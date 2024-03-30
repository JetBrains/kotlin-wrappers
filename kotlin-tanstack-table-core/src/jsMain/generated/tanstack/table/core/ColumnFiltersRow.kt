// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.ReadonlyRecord

external interface ColumnFiltersRow<TData : RowData> {
    /**
     * The column filters map for the row. This object tracks whether a row is passing/failing specific filters by their column ID.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#columnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    var columnFilters: ReadonlyRecord<String, Boolean>

    /**
     * The column filters meta map for the row. This object tracks any filter meta for a row as optionally provided during the filtering process.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#columnfiltersmeta)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    var columnFiltersMeta: ReadonlyRecord<String, FilterMeta>
}
