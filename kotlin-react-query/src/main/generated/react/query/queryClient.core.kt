// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external interface QueryClientConfig {
    var queryCache: QueryCache
    var mutationCache: MutationCache
    var defaultOptions: DefaultOptions<*>
}

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

    open fun <TData> setQueryData(
        queryKey: QueryKey,
        updater: Updater<TData?, TData>,
        options: SetDataOptions = definedExternally,
    ): TData

    open fun <TData> setQueriesData(
        queryKey: QueryKey,
        updater: Updater<TData?, TData>,
        options: SetDataOptions = definedExternally,
    ): Array<out dynamic>

    open fun <TData> setQueriesData(
        filters: QueryFilters,
        updater: Updater<TData?, TData>,
        options: SetDataOptions = definedExternally,
    ): Array<out dynamic>

    open fun <TData, TError> getQueryState(
        queryKey: QueryKey,
        filters: QueryFilters = definedExternally,
    ): QueryState<TData, TError>?

    open fun removeQueries(filters: QueryFilters = definedExternally)
    open fun removeQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
    )

    open fun resetQueries(
        filters: QueryFilters = definedExternally,
        options: ResetOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun resetQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
        options: ResetOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun cancelQueries(
        filters: QueryFilters = definedExternally,
        options: CancelOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun cancelQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
        options: CancelOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun invalidateQueries(
        filters: InvalidateQueryFilters = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun invalidateQueries(
        queryKey: QueryKey = definedExternally,
        filters: InvalidateQueryFilters = definedExternally,
        options: InvalidateOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun refetchQueries(
        filters: QueryFilters = definedExternally,
        options: RefetchOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun refetchQueries(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
        options: RefetchOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>): kotlin.js.Promise<TData>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(
        queryKey: TQueryKey,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<TData>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<TData>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey>): kotlin.js.Promise<Unit>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(
        queryKey: TQueryKey,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey>): kotlin.js.Promise<InfiniteData<TData>>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(
        queryKey: TQueryKey,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<InfiniteData<TData>>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> fetchInfiniteQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<InfiniteData<TData>>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey>): kotlin.js.Promise<Unit>
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(
        queryKey: TQueryKey,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> prefetchInfiniteQuery(
        queryKey: TQueryKey,
        queryFn: QueryFunction<TQueryFnData, TQueryKey>,
        options: FetchInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey> = definedExternally,
    ): kotlin.js.Promise<Unit>

    open fun cancelMutations(): kotlin.js.Promise<Unit>
    open fun resumePausedMutations(): kotlin.js.Promise<Unit>
    open fun <TData, TError, TVariables, TContext> executeMutation(options: MutationOptions<TData, TError, TVariables, TContext>): kotlin.js.Promise<TData>
    open fun getQueryCache(): QueryCache
    open fun getMutationCache(): MutationCache
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
    open fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey> defaultQueryOptions(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = definedExternally): QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    open fun <TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey> defaultQueryObserverOptions(options: QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey> = definedExternally): QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey>
    open fun <T : MutationOptions<*, *, *, *>> defaultMutationOptions(options: T = definedExternally): T
    open fun clear()
}
