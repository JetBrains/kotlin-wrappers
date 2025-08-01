// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface HeadersInstance<TData : RowData> {
    /**
     * Returns all header groups for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getheadergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the header groups for the left pinned columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getleftheadergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getLeftHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the header groups for columns that are not pinned.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getcenterheadergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getCenterHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the header groups for the right pinned columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getrightheadergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getRightHeaderGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * Returns the footer groups for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getfootergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the footer groups for the left pinned columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getleftfootergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getLeftFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the footer groups for columns that are not pinned.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getcenterfootergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getCenterFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * If pinning, returns the footer groups for the right pinned columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getrightfootergroups)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getRightFooterGroups: () -> ReadonlyArray<HeaderGroup<TData>>

    /**
     * Returns headers for all columns in the table, including parent headers.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getflatheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getFlatHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all left pinned columns in the table, including parent headers.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getleftflatheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getLeftFlatHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all columns that are not pinned, including parent headers.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getcenterflatheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getCenterFlatHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all right pinned columns in the table, including parent headers.
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getrightflatheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getRightFlatHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * Returns headers for all leaf columns in the table, (not including parent headers).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getleafheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getLeafHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all left pinned leaf columns in the table, (not including parent headers).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getleftleafheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getLeftLeafHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all columns that are not pinned, (not including parent headers).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getcenterleafheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getCenterLeafHeaders: () -> ReadonlyArray<Header<TData, *>>

    /**
     * If pinning, returns headers for all right pinned leaf columns in the table, (not including parent headers).
     * [API Docs](https://tanstack.com/table/v8/docs/api/core/headers#getrightleafheaders)
     * [Guide](https://tanstack.com/table/v8/docs/guide/headers)
     */
    val getRightLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
}
