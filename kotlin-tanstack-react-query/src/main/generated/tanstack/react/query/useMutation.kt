// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")
@file:JsNonModule

package tanstack.react.query

import tanstack.query.core.MutationFunction
import tanstack.query.core.MutationKey

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
