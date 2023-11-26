// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class Query<TQueryFnData, TError, TData, TQueryKey : QueryKey>(config: QueryConfig<TQueryFnData, TError, TData, TQueryKey>) :
    Removable {
    open var queryKey: TQueryKey
    open var queryHash: String
    open var options: QueryOptions<TQueryFnData, TError, TData, TQueryKey, *>
    open var state: QueryState<TData, TError>
    open var isFetchingOptimistic: Boolean
    open var meta: QueryMeta?
    override fun optionalRemove()
    open fun setData(
        newData: TData,
        options: SetDataOptions = definedExternally,
    ): TData

    open fun setState(
        state: QueryState<TData, TError>, /* Partial */
        setStateOptions: SetStateOptions = definedExternally,
    )

    open fun cancel(options: CancelOptions = definedExternally): Promise<Unit>
    override fun destroy()
    open fun reset()
    open fun isActive(): Boolean
    open fun isDisabled(): Boolean
    open fun isStale(): Boolean
    open fun isStaleByTime(staleTime: JsDuration = definedExternally): Boolean
    open fun onFocus()
    open fun onOnline()
    open fun addObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun removeObserver(observer: QueryObserver<*, *, *, *, *>)
    open fun getObserversCount(): Int
    open fun invalidate()
    open fun fetch(
        options: QueryOptions<TQueryFnData, TError, TData, TQueryKey, *> = definedExternally,
        fetchOptions: FetchOptions = definedExternally,
    ): Promise<TData>
}
