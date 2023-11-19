// Automatically generated - do not modify!

package tanstack.query.core

external interface MutationObserverOptions<TData, TError, TVariables, TContext>
    : MutationOptions<TData, TError, TVariables, TContext> {
    var useErrorBoundary: (error: TError) -> Boolean
}
