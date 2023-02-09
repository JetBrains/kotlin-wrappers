// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryFilters
import tanstack.query.core.QueryKey

external interface UseIsFetchingOptions : ContextOptions

external fun useIsFetching(
    filters: QueryFilters = definedExternally,
    options: UseIsFetchingOptions = definedExternally,
): Int

external fun useIsFetching(
    queryKey: QueryKey = definedExternally,
    filters: QueryFilters = definedExternally,
    options: UseIsFetchingOptions = definedExternally,
): Int
