package wrappers.example.hooks

import js.promise.Promise
import web.http.Request
import web.http.RequestInit
import web.http.fetchAsync
import wrappers.example.entities.Key
import wrappers.example.entities.Users

private val USERS_URL = "https://jsonplaceholder.typicode.com/users"

fun fetchUsersData(): Promise<Users> =
    fetchData(Request(USERS_URL))

fun <T> fetchUserData(
    id: Key,
    init: RequestInit = RequestInit(),
): Promise<T> =
    fetchData(Request("$USERS_URL/$id", init))

fun <T> fetchUserData(
    init: RequestInit,
): Promise<T> =
    fetchData(Request(USERS_URL, init))

private fun <T> fetchData(
    request: Request,
): Promise<T> {
    return fetchAsync(request)
        .then { it.jsonAsync() }
        .then { it.unsafeCast<T>() }
}
