// Automatically generated - do not modify!

package tanstack.query.core

import js.core.ReadonlyArray

external interface RefetchPageFilters<TPageData> {
    var refetchPage: (lastPage: TPageData, index: Int, allPages: ReadonlyArray<TPageData>) -> Boolean
}
