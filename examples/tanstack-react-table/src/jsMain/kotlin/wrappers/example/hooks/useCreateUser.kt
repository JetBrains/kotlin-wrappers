package wrappers.example.hooks

import js.json.stringify
import web.http.BodyInit
import web.http.RequestInit
import web.http.RequestMethod
import wrappers.example.entities.CreateUserOptions
import wrappers.example.entities.User

typealias CreateUser = (CreateUserOptions) -> Unit

fun useCreateUser(): CreateUser =
    useMutateUser { options ->
        createUser(options)
    }

private suspend fun createUser(
    options: CreateUserOptions,
): User =
    fetchUserData(
        init = RequestInit(
            method = RequestMethod.POST,
            body = BodyInit(stringify(options)),
        )
    )
