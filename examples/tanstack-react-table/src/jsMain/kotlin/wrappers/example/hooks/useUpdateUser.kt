package wrappers.example.hooks

import js.objects.jso
import js.promise.Promise
import web.http.BodyInit
import web.http.RequestMethod
import wrappers.example.entities.User

typealias UpdateUser = (User) -> Unit

fun useUpdateUser(): UpdateUser =
    useMutateUser { user ->
        updateUser(user)
    }

private fun updateUser(user: User): Promise<User> =
    fetchData(
        id = user.id,
        init = jso {
            method = RequestMethod.PUT
            body = BodyInit(JSON.stringify(user))
        }
    )
