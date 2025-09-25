// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.QueryClient

external fun <TData, TError, TVariables, TOnMutateResult> useMutation(
    options: UseMutationOptions<TData, TError, TVariables, TOnMutateResult>,
    queryClient: QueryClient = definedExternally,
): UseMutationResult<TData, TError, TVariables, TOnMutateResult>
