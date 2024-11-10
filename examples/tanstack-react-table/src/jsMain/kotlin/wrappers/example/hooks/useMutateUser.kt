package wrappers.example.hooks

import js.objects.jso
import js.reflect.unsafeCast
import tanstack.query.core.InvalidateQueryFilters
import tanstack.query.core.QueryKey
import tanstack.react.query.useMutation
import tanstack.react.query.useQueryClient
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.entities.User
import wrappers.example.query.createMutationFunction

fun <D, M : Function<Unit>> useMutateUser(
    action: suspend (User) -> D,
): M {
    val queryClient = useQueryClient()
    val mutate = useMutation<D, Error, User, QueryKey>(
        options = jso {
            mutationFn = createMutationFunction(action)
            onSuccess = { _, _, _ ->
                queryClient.invalidateQueries(
                    filters = InvalidateQueryFilters(
                        queryKey = USERS_QUERY_KEY
                    )
                )
            }
        }
    ).mutate

    return unsafeCast(mutate)
}
