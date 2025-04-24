package example.hooks

import example.entities.User
import web.http.RequestInit
import web.http.RequestMethod

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
