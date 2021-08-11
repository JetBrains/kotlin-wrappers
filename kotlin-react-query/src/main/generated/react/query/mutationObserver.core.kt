// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

typealias MutationObserverListener<TData, TError, TVariables, TContext> = (result: MutationObserverResult<TData, TError, TVariables, TContext>) -> Unit

open external class MutationObserver<TData, TError, TVariables, TContext>(
    client: QueryClient,
    options: MutationObserverOptions<TData, TError, TVariables, TContext>,
) : Subscribable<MutationObserverListener<TData, TError, TVariables, TContext>> {
    open var options: MutationObserverOptions<TData, TError, TVariables, TContext>
    protected open fun bindMethods()
    open fun setOptions(options: MutationObserverOptions<TData, TError, TVariables, TContext> = definedExternally)
    override fun onUnsubscribe()
    open fun onMutationUpdate(action: MutationAction<TData, TError, TVariables, TContext>)
    open fun getCurrentResult(): MutationObserverResult<TData, TError, TVariables, TContext>
    open fun reset()
    open fun mutate(
        variables: TVariables = definedExternally,
        options: MutateOptions<TData, TError, TVariables, TContext> = definedExternally,
    ): kotlin.js.Promise<TData>
}
