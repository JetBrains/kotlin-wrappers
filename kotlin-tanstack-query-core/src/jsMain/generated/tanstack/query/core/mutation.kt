// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import kotlin.js.Promise

external interface MutationConfig<TData, TError, TVariables, TContext> {
    var mutationId: Int
    var mutationCache: MutationCache
    var options: MutationOptions<TData, TError, TVariables, TContext>
    var logger: Logger
    var defaultOptions: MutationOptions<TData, TError, TVariables, TContext>
    var state: MutationState<TData, TError, TVariables, TContext>
    var meta: MutationMeta
}

external interface MutationState<TData, TError, TVariables, TContext> {
    val context: TContext?
    val data: TData?
    val error: TError?
    val failureCount: Int
    val failureReason: TError?
    val isPaused: Boolean
    val status: MutationStatus
    val variables: TVariables?
}

external interface MutationFailedAction<TError> {
    var type: Type /* 'failed' */
    var failureCount: Int
    var error: TError?
}

external interface MutationLoadingAction<TVariables, TContext> {
    var type: Type /* 'loading' */
    var variables: TVariables
    var context: TContext
}

external interface MutationSuccessAction<TData> {
    var type: Type /* 'success' */
    var data: TData
}

external interface MutationErrorAction<TError> {
    var type: Type /* 'error' */
    var error: TError
}

external interface MutationPauseAction {
    var type: Type /* 'pause' */
}

external interface MutationContinueAction {
    var type: Type /* 'continue' */
}

external interface MutationSetStateAction<TData, TError, TVariables, TContext> {
    var type: Type /* 'setState' */
    var state: MutationState<TData, TError, TVariables, TContext>
}

typealias MutationAction<TData, TError, TVariables, TContext> = Union /* ContinueAction | ErrorAction<TError> | FailedAction<TError> | LoadingAction<TVariables, TContext> | PauseAction | SetStateAction<TData, TError, TVariables, TContext> | SuccessAction<TData> */

open external class Mutation<TData, TError, TVariables, TContext>(config: MutationConfig<TData, TError, TVariables, TContext>) :
    Removable {
    open var state: MutationState<TData, TError, TVariables, TContext>
    open var options: MutationOptions<TData, TError, TVariables, TContext>
    open var mutationId: Int
    open var meta: MutationMeta?
    open fun setState(state: MutationState<TData, TError, TVariables, TContext>)
    open fun addObserver(observer: MutationObserver<*, *, *, *>)
    open fun removeObserver(observer: MutationObserver<*, *, *, *>)
    override fun optionalRemove()
    open fun `continue`(): Promise<TData>
    open fun execute(): Promise<TData>
}

external fun <TData, TError, TVariables, TContext> getDefaultState(): MutationState<TData, TError, TVariables, TContext>
