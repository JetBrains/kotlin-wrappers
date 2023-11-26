// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryClient
import tanstack.query.core.QueryKey
import tanstack.query.core.QueryObserver
import tanstack.query.core.QueryObserverResult

external fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey> useBaseQuery(
    options: UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>,
    Observer: JsClass<QueryObserver<*, *, *, *, *>>,
    queryClient: QueryClient = definedExternally,
): QueryObserverResult<TData, TError>
