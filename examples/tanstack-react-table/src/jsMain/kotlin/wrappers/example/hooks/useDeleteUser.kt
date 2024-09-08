package wrappers.example.hooks

import js.objects.jso
import js.promise.Promise
import web.http.RequestMethod
import web.http.fetchAsync
import wrappers.example.entities.User

typealias DeleteUser = (User) -> Unit

fun useDeleteUser(): DeleteUser =
    useMutateUser { user ->
        deleteUser(user)
    }

private fun deleteUser(user: User): Promise<Unit> =
    fetchAsync(
        input = "https://jsonplaceholder.typicode.com/users/${user.id}",
        init = jso { method = RequestMethod.DELETE }
    ).then {}
