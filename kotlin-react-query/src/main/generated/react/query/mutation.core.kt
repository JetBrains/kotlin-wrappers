// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface MutationConfig<TData, TError, TVariables, TContext> {
    var mutationId: Int
    var mutationCache: MutationCache
    var options: MutationOptions<TData, TError, TVariables, TContext>
    var defaultOptions: MutationOptions<TData, TError, TVariables, TContext>
    var state: MutationState<TData, TError, TVariables, TContext>
}

external interface MutationState<TData, TError, TVariables, TContext> {
    var context: TContext?
    var data: TData?
    var error: TError?
    var failureCount: Int
    var isPaused: Boolean
    var status: MutationStatus
    var variables: TVariables?
}

external interface MutationFailedAction {
    var type: Type /* 'failed' */
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

typealias MutationAction<TData, TError, TVariables, TContext> = Union /* ContinueAction | ErrorAction<TError> | FailedAction | LoadingAction<TVariables, TContext> | PauseAction | SetStateAction<TData, TError, TVariables, TContext> | SuccessAction<TData> */

open external class Mutation<TData, TError, TVariables, TContext>(config: MutationConfig<TData, TError, TVariables, TContext>) {
    open var state: MutationState<TData, TError, TVariables, TContext>
    open var options: MutationOptions<TData, TError, TVariables, TContext>
    open var mutationId: Int
    open fun setState(state: MutationState<TData, TError, TVariables, TContext>)
    open fun addObserver(observer: MutationObserver<*, *, *, *>)
    open fun removeObserver(observer: MutationObserver<*, *, *, *>)
    open fun cancel(): kotlin.js.Promise<Unit>
    open fun `continue`(): kotlin.js.Promise<TData>
    open fun execute(): kotlin.js.Promise<TData>
}

external fun <TData, TError, TVariables, TContext> getDefaultState(): MutationState<TData, TError, TVariables, TContext>
