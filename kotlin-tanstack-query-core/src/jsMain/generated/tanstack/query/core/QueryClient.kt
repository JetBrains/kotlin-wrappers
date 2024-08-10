// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise

open external class QueryClient(config: QueryClientConfig = definedExternally) {
    open fun mount()
    open fun unmount()
    open fun isFetching(filters: QueryFilters = definedExternally): Int
    open fun isMutating(filters: MutationFilters = definedExternally): Int
    open fun <TQueryFnData> getQueryData(queryKey: QueryKey): TQueryFnData?
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> ensureQueryData(options: EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey, *>): Promise<TData>
    open fun <TQueryFnData> getQueriesData(filters: QueryFilters): ReadonlyArray<JsTuple2<QueryKey, TQueryFnData?>>
    open fun <TQueryFnData> setQueryData(
        queryKey: QueryKey,
        updater: Updater<TQueryFnData?, TQueryFnData?>,
        options: SetDataOptions = definedExternally,
    ): TQueryFnData?

    open fun <TQueryFnData> setQueriesData(
        filters: QueryFilters,
        updater: Updater<TQueryFnData?, TQueryFnData?>,
        options: SetDataOptions = definedExternally,
    ): ReadonlyArray<JsTuple2<QueryKey, TQueryFnData?>>

    open fun <TQueryFnData, TError> getQueryState(queryKey: QueryKey): QueryState<TQueryFnData, TError>?
    open fun removeQueries(filters: QueryFilters = definedExternally)
    open fun resetQueries(
        filters: QueryFilters = definedExternally,
        options: ResetOptions = definedExternally,
    ): Promise<Void>

    open fun cancelQueries(
        filters: QueryFilters = definedExternally,
        cancelOptions: CancelOptions = definedExternally,
    ): Promise<Void>

    open fun invalidateQueries(
        filters: InvalidateQueryFilters = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): Promise<Void>

    open fun refetchQueries(
        filters: RefetchQueryFilters = definedExternally,
        options: RefetchOptions = definedExternally,
    ): Promise<Void>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> fetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<TData>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, *>): Promise<Void>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> fetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<InfiniteData<TData, TPageParam>>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> prefetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<Void>
    open fun resumePausedMutations(): Promise<*>
    open fun getQueryCache(): QueryCache
    open fun getMutationCache(): MutationCache
    open fun getDefaultOptions(): DefaultOptions<*>
    open fun setDefaultOptions(options: DefaultOptions<*>)
    open fun setQueryDefaults(
        queryKey: QueryKey,
        options: QueryObserverOptions<*, *, *, *, *, *>, /* Partial */
    )

    open fun getQueryDefaults(queryKey: QueryKey): QueryObserverOptions<*, *, *, *, *, *>
    open fun setMutationDefaults(
        mutationKey: MutationKey,
        options: MutationObserverOptions<*, *, *, *>,
    )

    open fun getMutationDefaults(mutationKey: MutationKey): MutationObserverOptions<*, *, *, *>
    open fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam> defaultQueryOptions(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> /* | DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> */): DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    open fun <T : MutationOptions<*, *, *, *>> defaultMutationOptions(options: T = definedExternally): T
    open fun clear()
}
