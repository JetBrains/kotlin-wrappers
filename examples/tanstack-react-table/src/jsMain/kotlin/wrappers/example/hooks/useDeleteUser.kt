package wrappers.example.hooks

import web.http.RequestInit
import web.http.RequestMethod
import wrappers.example.entities.User

typealias DeleteUser = (User) -> Unit

fun useDeleteUser(): DeleteUser =
    useMutateUser { user ->
        deleteUser(user)
    }

private suspend fun deleteUser(user: User): Unit =
    fetchUserData(
        id = user.id,
        init = RequestInit(method = RequestMethod.DELETE)
    )
