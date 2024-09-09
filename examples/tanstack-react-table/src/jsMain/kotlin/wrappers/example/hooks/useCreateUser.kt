package wrappers.example.hooks

import web.http.BodyInit
import web.http.RequestInit
import web.http.RequestMethod
import wrappers.example.entities.User

typealias CreateUser = (User) -> Unit

fun useCreateUser(): CreateUser =
    useMutateUser { user ->
        createUser(user)
    }

private suspend fun createUser(user: User): User =
    fetchUserData(
        init = RequestInit(
            method = RequestMethod.POST,
            body = BodyInit(JSON.stringify(user)),
        )
    )
