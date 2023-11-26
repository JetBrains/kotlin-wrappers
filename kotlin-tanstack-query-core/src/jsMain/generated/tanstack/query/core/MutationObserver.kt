// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class MutationObserver<TData, TError, TVariables, TContext>(
    client: QueryClient,
    options: MutationObserverOptions<TData, TError, TVariables, TContext>,
) : Subscribable<MutationObserverListener<TData, TError, TVariables, TContext>> {
    open var options: MutationObserverOptions<TData, TError, TVariables, TContext>
    protected open fun bindMethods()
    open fun setOptions(options: MutationObserverOptions<TData, TError, TVariables, TContext> = definedExternally)
    override fun onUnsubscribe()
    open fun onMutationUpdate(action: Action_1<TData, TError, TVariables, TContext>)
    open fun getCurrentResult(): MutationObserverResult<TData, TError, TVariables, TContext>
    open fun reset()
    open fun mutate(
        variables: TVariables,
        options: MutateOptions<TData, TError, TVariables, TContext> = definedExternally,
    ): Promise<TData>
}
