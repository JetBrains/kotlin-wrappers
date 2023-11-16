// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreHeader<TData : RowData, TValue> {
    /**
     * The col-span for the header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#colspan)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var colSpan: Int

    /**
     * The header's associated column object.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#column)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var column: Column<TData, TValue>

    /**
     * The depth of the header, zero-indexed based.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#depth)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var depth: Int

    /**
     * Returns the rendering context (or props) for column-based components like headers, footers and filters.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#getcontext)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var getContext: () -> HeaderContext<TData, TValue>

    /**
     * Returns the leaf headers hierarchically nested under this header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#getleafheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var getLeafHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * The header's associated header group object.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#headergroup)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var headerGroup: HeaderGroup<TData>

    /**
     * The unique identifier for the header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#id)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var id: String

    /**
     * The index for the header within the header group.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#index)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var index: Int

    /**
     * A boolean denoting if the header is a placeholder header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#isplaceholder)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var isPlaceholder: Boolean

    /**
     * If the header is a placeholder header, this will be a unique header ID that does not conflict with any other headers across the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#placeholderid)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var placeholderId: String?

    /**
     * The row-span for the header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#rowspan)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var rowSpan: Int

    /**
     * The header's hierarchical sub/child headers. Will be empty if the header's associated column is a leaf-column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/header#subheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    var subHeaders: ReadonlyArray<Header<TData, TValue>>
}
