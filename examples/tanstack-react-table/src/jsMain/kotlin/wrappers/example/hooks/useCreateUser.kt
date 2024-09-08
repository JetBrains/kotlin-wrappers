package wrappers.example.hooks

import js.objects.jso
import js.promise.Promise
import web.http.BodyInit
import web.http.RequestMethod
import web.http.fetchAsync
import wrappers.example.entities.User

typealias CreateUser = (User) -> Unit

fun useCreateUser(): CreateUser =
    useMutateUser { user ->
        createUser(user)
    }

private fun createUser(user: User): Promise<User> =
    fetchAsync(
        input = "https://jsonplaceholder.typicode.com/users",
        init = jso {
            method = RequestMethod.POST
            body = BodyInit(JSON.stringify(user))
        }
    ).then { it.jsonAsync() }.then { it.unsafeCast<User>() }
