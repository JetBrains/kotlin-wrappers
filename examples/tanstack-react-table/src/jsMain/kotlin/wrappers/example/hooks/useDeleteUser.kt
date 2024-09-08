package wrappers.example.hooks

import js.objects.jso
import js.promise.Promise
import tanstack.query.core.QueryKey
import tanstack.react.query.useMutation
import tanstack.react.query.useQueryClient
import web.http.RequestMethod
import web.http.fetchAsync
import wrappers.example.USERS_QUERY_KEY
import wrappers.example.entities.User

typealias DeleteUser = (User) -> Unit

fun useDeleteUser(): DeleteUser {
    val client = useQueryClient()
    return useMutation<Unit, Error, User, QueryKey>(
        options = jso {
            mutationFn = { user -> deleteUser(user) }
            onSuccess = { _, _, _ ->
                client.invalidateQueries(
                    filters = jso {
                        queryKey = USERS_QUERY_KEY
                    }
                )
            }
        }
    ).mutate.unsafeCast<DeleteUser>()
}

private fun deleteUser(user: User): Promise<Unit> =
    fetchAsync(
        input = "https://jsonplaceholder.typicode.com/users/${user.id}",
        init = jso { method = RequestMethod.DELETE }
    ).then {}
