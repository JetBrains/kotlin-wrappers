package team.karakum.hooks

import js.objects.jso
import js.promise.Promise
import tanstack.query.core.QueryKey
import tanstack.react.query.useMutation
import tanstack.react.query.useQueryClient
import team.karakum.USERS_QUERY_KEY
import team.karakum.entities.User
import web.http.RequestMethod
import web.http.fetchAsync

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
