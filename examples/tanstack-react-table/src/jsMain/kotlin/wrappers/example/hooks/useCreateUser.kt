package wrappers.example.hooks

import js.promise.Promise
import web.http.BodyInit
import web.http.RequestInit
import web.http.RequestMethod
import wrappers.example.entities.User

typealias CreateUser = (User) -> Unit

fun useCreateUser(): CreateUser =
    useMutateUser { user ->
        createUser(user)
    }

private fun createUser(user: User): Promise<User> =
    fetchData(
        init = RequestInit(
            method = RequestMethod.POST,
            body = BodyInit(JSON.stringify(user)),
        )
    )
