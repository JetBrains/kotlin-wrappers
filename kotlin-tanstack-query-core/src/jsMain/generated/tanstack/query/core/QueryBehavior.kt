// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryBehavior<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var onFetch: (context: FetchContext<TQueryFnData, TError, TData, TQueryKey>, query: Query<*, *, *, *>) -> Unit
}
