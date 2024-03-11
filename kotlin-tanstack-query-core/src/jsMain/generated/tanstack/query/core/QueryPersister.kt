// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.PromiseResult

typealias QueryPersister<T, TQueryKey, TPageParam> = (queryFn: QueryFunction<T, TQueryKey, TPageParam>, context: QueryFunctionContext<TQueryKey, *>, query: Query<*, *, *, *>) -> PromiseResult<T>
