package example.hooks

import example.entities.User
import js.json.stringify
import web.http.BodyInit
import web.http.PUT
import web.http.RequestInit
import web.http.RequestMethod

typealias UpdateUser = (User) -> Unit

fun useUpdateUser(): UpdateUser =
    useMutateUser { user ->
        updateUser(user)
    }

private suspend fun updateUser(user: User): User =
    fetchUserData(
        id = user.id,
        init = RequestInit(
            method = RequestMethod.PUT,
            body = BodyInit(stringify(user)),
        )
    )
