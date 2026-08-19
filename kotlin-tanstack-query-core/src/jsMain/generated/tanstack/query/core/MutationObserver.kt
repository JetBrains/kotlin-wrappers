// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class MutationObserver<TData, TError, TVariables, TOnMutateResult>(
    client: QueryClient,
    options: MutationObserverOptions<TData, TError, TVariables, TOnMutateResult>,
) : Subscribable<MutationObserverListener<TData, TError, TVariables, TOnMutateResult>> {
    open var options: MutationObserverOptions<TData, TError, TVariables, TOnMutateResult>
    protected open fun bindMethods()
    open fun setOptions(options: MutationObserverOptions<TData, TError, TVariables, TOnMutateResult>)
    override fun onUnsubscribe()
    open fun onMutationUpdate(action: Action<TData, TError, TVariables, TOnMutateResult>)
    open fun getCurrentResult(): MutationObserverResult<TData, TError, TVariables, TOnMutateResult>
    open fun reset()
    open fun mutate(
        variables: TVariables,
        options: MutateOptions<TData, TError, TVariables, TOnMutateResult> = definedExternally,
    ): Promise<TData>
}
