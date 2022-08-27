// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

package tanstack.query.core

import kotlinx.js.JsTuple2
import kotlinx.js.ReadonlyArray
import kotlin.js.Promise

open external class QueryClient(config: QueryClientConfig = definedExternally) {
    open fun mount()
    open fun unmount()
    open fun isFetching(filters: QueryFilters = definedExternally): Int
    open fun isFetching(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
    ): Int

    open fun isMutating(filters: MutationFilters = definedExternally): Int
    open fun <TData> getQueryData(
        queryKey: QueryKey,
        filters: QueryFilters = definedExternally,
    ): TData?

    open fun <TData> getQueriesData(queryKey: QueryKey): ReadonlyArray<JsTuple2<QueryKey, TData>>
    open fun <TData> getQueriesData(filters: QueryFilters): ReadonlyArray<JsTuple2<QueryKey, TData>>
    open fun <TData> setQueryData(
        queryKey: QueryKey,
        updater: Updater<TData?, TData?>,
        options: SetDataOptions = definedExternally,
    ): TData?

    open fun <TData> setQueriesData(
        queryKey: QueryKey,
        updater: Updater<TData?, TData?>,
        options: SetDataOptions = definedExternally,
    ): JsTuple2<QueryKey, Any /* TData | undefined][ */>

    open fun <TData> setQueriesData(
        filters: QueryFilters,
        updater: Updater<TData?, TData?>,
        options: SetDataOptions = definedExternally,
    ): JsTuple2<QueryKey, Any /* TData | undefined][ */>

    open fun <TData, TError> getQueryState(
        queryKey: QueryKey,
        filters: QueryFilters = definedExternally,
    ): QueryState<TData, TError>?

    open fun removeQueries(filters: QueryFilters = definedExternally)
    open fun removeQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
    )

    open fun <TPageData> resetQueries(
        filters: ResetQueryFilters<TPageData> = definedExternally,
        options: ResetOptions = definedExternally,
    ): Promise<Unit>

    open fun <TPageData> resetQueries(
        queryKey: QueryKey = definedExternally,
        filters: ResetQueryFilters<TPageData> = definedExternally,
        options: ResetOptions = definedExternally,
    ): Promise<Unit>

    open fun cancelQueries(
        filters: QueryFilters = definedExternally,
        options: CancelOptions = definedExternally,
    ): Promise<Unit>

    open fun cancelQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
        options: CancelOptions = definedExternally,
    ): Promise<Unit>

    open fun <TPageData> invalidateQueries(
        filters: InvalidateQueryFilters<TPageData> = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): Promise<Unit>

    open fun <TPageData> invalidateQueries(
        queryKey: QueryKey = definedExternally,
        filters: InvalidateQueryFilters<TPageData> = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): Promise<Unit>

    open fun <TPageData> refetchQueries(
        filters: RefetchQueryFilters<TPageData> = definedExternally,
        options: RefetchOptions = definedExternally,
    ): Promise<Unit>

    open fun <TPageData> refetchQueries(
        queryKey: QueryKey = definedExternally,
        filters: RefetchQueryFilters<TPageData> = definedExternally,
        options: RefetchOptions = definedExternally,
    ): Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>): Promise<TData>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(
        queryKey: TQueryKey,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<TData>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<TData>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>): Promise<Unit>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(
        queryKey: TQueryKey,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey>): Promise<InfiniteData<TData>>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(
        queryKey: TQueryKey,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<InfiniteData<TData>>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<InfiniteData<TData>>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey>): Promise<Unit>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(
        queryKey: TQueryKey,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): Promise<Unit>

    open fun resumePausedMutations(): Promise<Unit>
    open fun getQueryCache(): QueryCache
    open fun getMutationCache(): MutationCache
    open fun getLogger(): Logger
    open fun getDefaultOptions(): DefaultOptions<*>
    open fun setDefaultOptions(options: DefaultOptions<*>)
    open fun setQueryDefaults(
        queryKey: QueryKey,
        options: QueryObserverOptions<*, *, *, *, *>,
    )

    open fun getQueryDefaults(queryKey: QueryKey = definedExternally): QueryObserverOptions<*, *, *, *, *>?
    open fun setMutationDefaults(
        mutationKey: MutationKey,
        options: MutationObserverOptions<*, *, *, *>,
    )

    open fun getMutationDefaults(mutationKey: MutationKey = definedExternally): MutationObserverOptions<*, *, *, *>?
    open fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey> defaultQueryOptions(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>? /* | DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> */): DefaultedQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    open fun <T : MutationOptions<*, *, *, *>> defaultMutationOptions(options: T = definedExternally): T
    open fun clear()
}
