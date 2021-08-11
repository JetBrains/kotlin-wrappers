// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external fun <TData, TError, TVariables, TContext> useMutation(options: UseMutationOptions<TData, TError, TVariables, TContext>): UseMutationResult<TData, TError, TVariables, TContext>

external fun <TData, TError, TVariables, TContext> useMutation(
    mutationFn: MutationFunction<TData, TVariables>,
    options: UseMutationOptions<TData, TError, TVariables, TContext> = definedExternally,
): UseMutationResult<TData, TError, TVariables, TContext>

external fun <TData, TError, TVariables, TContext> useMutation(
    mutationKey: MutationKey,
    options: UseMutationOptions<TData, TError, TVariables, TContext> = definedExternally,
): UseMutationResult<TData, TError, TVariables, TContext>

external fun <TData, TError, TVariables, TContext> useMutation(
    mutationKey: MutationKey,
    mutationFn: MutationFunction<TData, TVariables> = definedExternally,
    options: UseMutationOptions<TData, TError, TVariables, TContext> = definedExternally,
): UseMutationResult<TData, TError, TVariables, TContext>
