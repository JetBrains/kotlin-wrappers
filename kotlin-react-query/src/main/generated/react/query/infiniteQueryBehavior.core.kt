// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external fun <TQueryFnData, TError, TData> infiniteQueryBehavior(): QueryBehavior<TQueryFnData, TError, InfiniteData<TData>, *>

external fun getNextPageParam(
    options: QueryOptions<*, *, *, *>,
    pages: Array<out Page>,
): Any?

external fun getPreviousPageParam(
    options: QueryOptions<*, *, *, *>,
    pages: Array<out Page>,
): Any?

external fun hasNextPage(
    options: QueryOptions<*, *, *, *>,
    pages: Page = definedExternally,
): Boolean?

external fun hasPreviousPage(
    options: QueryOptions<*, *, *, *>,
    pages: Page = definedExternally,
): Boolean?
