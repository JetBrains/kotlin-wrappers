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
    open fun <TQueryFilters : QueryFilters<*, *, *, *>> isFetching(filters: TQueryFilters = definedExternally): Int
    open fun <TMutationFilters : MutationFilters<*, *, *, *>> isMutating(filters: TMutationFilters = definedExternally): Int
    open fun <TQueryFnData> getQueryData(queryKey: QueryKey): TQueryFnData?
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> ensureQueryData(options: EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey, *>): Promise<TData>
    open fun <TQueryFnData, TQueryFilters : QueryFilters<*, *, *, *>> getQueriesData(filters: TQueryFilters): ReadonlyArray<JsTuple2<QueryKey, TQueryFnData?>>
    open fun <TQueryFnData> setQueryData(
        queryKey: QueryKey,
        updater: Updater<TQueryFnData?, TQueryFnData?>,
        options: SetDataOptions = definedExternally,
    ): TQueryFnData?

    open fun <TQueryFnData, TQueryFilters : QueryFilters<*, *, *, *>> setQueriesData(
        filters: TQueryFilters,
        updater: Updater<TQueryFnData?, TQueryFnData?>,
        options: SetDataOptions = definedExternally,
    ): ReadonlyArray<JsTuple2<QueryKey, TQueryFnData?>>

    open fun <TQueryFnData, TError> getQueryState(queryKey: QueryKey): QueryState<TQueryFnData, TError>?
    open fun <TQueryFilters : QueryFilters<*, *, *, *>> removeQueries(filters: TQueryFilters = definedExternally)
    open fun <TQueryFilters : QueryFilters<*, *, *, *>> resetQueries(
        filters: TQueryFilters = definedExternally,
        options: ResetOptions = definedExternally,
    ): Promise<Void>

    open fun <TQueryFilters : QueryFilters<*, *, *, *>> cancelQueries(
        filters: TQueryFilters = definedExternally,
        cancelOptions: CancelOptions = definedExternally,
    ): Promise<Void>

    open fun <TInvalidateQueryFilters : InvalidateQueryFilters<*, *, *, *>> invalidateQueries(
        filters: TInvalidateQueryFilters = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): Promise<Void>

    open fun <TRefetchQueryFilters : RefetchQueryFilters<*, *, *, *>> refetchQueries(
        filters: TRefetchQueryFilters = definedExternally,
        options: RefetchOptions = definedExternally,
    ): Promise<Void>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> fetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<TData>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, *>): Promise<Void>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> fetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<InfiniteData<TData, TPageParam>>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> prefetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<Void>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> ensureInfiniteQueryData(options: EnsureInfiniteQueryDataOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam>): Promise<InfiniteData<TData, TPageParam>>
    open fun resumePausedMutations(): Promise<*>
    open fun getQueryCache(): QueryCache
    open fun getMutationCache(): MutationCache
    open fun getDefaultOptions(): DefaultOptions<*>
    open fun setDefaultOptions(options: DefaultOptions<*>)
    open fun <TQueryFnData, TError, TData, TQueryData> setQueryDefaults(
        queryKey: QueryKey,
        options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, *, *>, /* Partial */
    )

    open fun getQueryDefaults(queryKey: QueryKey): QueryObserverOptions<*, *, *, *, *, *>
    open fun <TData, TError, TVariables, TContext> setMutationDefaults(
        mutationKey: MutationKey,
        options: MutationObserverOptions<TData, TError, TVariables, TContext>,
    )

    open fun getMutationDefaults(mutationKey: MutationKey): MutationObserverOptions<*, *, *, *>
    open fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam> defaultQueryOptions(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> /* | DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> */): DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    open fun <T : MutationOptions<*, *, *, *>> defaultMutationOptions(options: T = definedExternally): T
    open fun clear()
}
