package wrappers.example.hooks

import js.errors.JsError
import js.reflect.unsafeCast
import tanstack.query.core.InvalidateQueryFilters
import tanstack.query.core.QueryKey
import tanstack.react.query.UseMutationOptions
import tanstack.react.query.useMutation
import tanstack.react.query.useQueryClient
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.query.createMutationFunction

fun <O, R> useMutateUser(
    action: suspend (O) -> R,
): (O) -> Unit {
    val queryClient = useQueryClient()
    val mutate = useMutation<R, JsError, O, QueryKey>(
        options = UseMutationOptions(
            mutationFn = createMutationFunction(action),
            onSuccess = { _, _, _ ->
                queryClient.invalidateQueries(
                    filters = InvalidateQueryFilters<QueryKey>(
                        queryKey = USERS_QUERY_KEY
                    )
                )
            },
        )
    ).mutate

    return unsafeCast(mutate)
}
