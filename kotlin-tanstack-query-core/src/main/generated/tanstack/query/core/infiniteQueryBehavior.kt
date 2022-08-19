// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

package tanstack.query.core

import kotlinx.js.ReadonlyArray

external fun <TQueryFnData, TError, TData> infiniteQueryBehavior(): QueryBehavior<TQueryFnData, TError, InfiniteData<TData>, *>

external fun getNextPageParam(
    options: QueryOptions<*, *, *, *>,
    pages: ReadonlyArray<Page>,
): Any?

external fun getPreviousPageParam(
    options: QueryOptions<*, *, *, *>,
    pages: ReadonlyArray<Page>,
): Any?

external fun hasNextPage(
    options: QueryOptions<*, *, *, *>,
    pages: Page = definedExternally,
): Boolean?

external fun hasPreviousPage(
    options: QueryOptions<*, *, *, *>,
    pages: Page = definedExternally,
): Boolean?
