// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

external interface InfiniteQueryObserverBaseResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    val fetchNextPage: (options: FetchNextPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val fetchPreviousPage: (options: FetchPreviousPageOptions?) -> Promise<InfiniteQueryObserverResult<TData, TError>>
    val hasNextPage: Boolean
    val hasPreviousPage: Boolean
    val isFetchingNextPage: Boolean
    val isFetchingPreviousPage: Boolean
}
