package wrappers.example.hooks

import js.promise.Promise
import web.http.RequestInit
import web.http.RequestMethod
import wrappers.example.entities.User

typealias DeleteUser = (User) -> Unit

fun useDeleteUser(): DeleteUser =
    useMutateUser { user ->
        deleteUser(user)
    }

private fun deleteUser(user: User): Promise<Unit> =
    fetchData(
        id = user.id,
        init = RequestInit(method = RequestMethod.DELETE)
    )
