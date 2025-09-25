// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class Mutation<TData, TError, TVariables, TOnMutateResult>(
    config: MutationConfig<TData, TError, TVariables, TOnMutateResult>,
) : Removable {
    open var state: MutationState<TData, TError, TVariables, TOnMutateResult>
    open var options: MutationOptions<TData, TError, TVariables, TOnMutateResult>
    open val mutationId: Int
    open fun setOptions(options: MutationOptions<TData, TError, TVariables, TOnMutateResult>)
    open var meta: MutationMeta?
    open fun addObserver(observer: MutationObserver<*, *, *, *>)
    open fun removeObserver(observer: MutationObserver<*, *, *, *>)
    override fun optionalRemove()
    open fun `continue`(): Promise<*>
    open fun execute(variables: TVariables): Promise<TData>
}
