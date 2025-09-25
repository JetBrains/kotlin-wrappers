package example.hooks

import example.USERS_QUERY_KEY
import js.errors.JsError
import js.function.unsafeAsync
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import tanstack.query.core.InvalidateQueryFilters
import tanstack.query.core.QueryKey
import tanstack.react.query.UseMutationOptions
import tanstack.react.query.useMutation
import tanstack.react.query.useQueryClient

fun <O, R> useMutateUser(
    action: suspend CoroutineScope.(O, Any) -> R,
): (O) -> Unit {
    val queryClient = useQueryClient()
    val mutate = useMutation<R, JsError, O, QueryKey>(
        options = UseMutationOptions(
            mutationFn = unsafeAsync(action),
            onSuccess = { _, _, _, _ ->
                queryClient.invalidateQueries(
                    filters = InvalidateQueryFilters(
                        queryKey = USERS_QUERY_KEY
                    )
                )
            },
        )
    ).mutate

    return unsafeCast(mutate)
}
