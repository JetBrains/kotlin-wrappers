package example.hooks

import example.entities.CreateUserOptions
import example.entities.User
import js.json.stringify
import web.http.BodyInit
import web.http.POST
import web.http.RequestInit
import web.http.RequestMethod

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
