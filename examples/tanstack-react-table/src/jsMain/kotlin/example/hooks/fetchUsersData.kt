package example.hooks

import example.entities.Key
import example.entities.UserList
import js.reflect.unsafeCast
import web.http.Request
import web.http.RequestInit
import web.http.fetch
import web.http.json

private val USERS_URL = "https://jsonplaceholder.typicode.com/users"

suspend fun fetchUsersData(): UserList =
    fetchData(Request(USERS_URL))

suspend fun <T> fetchUserData(
    id: Key,
    init: RequestInit = RequestInit(),
): T =
    fetchData(Request("$USERS_URL/$id", init))

suspend fun <T> fetchUserData(
    init: RequestInit,
): T =
    fetchData(Request(USERS_URL, init))

private suspend fun <T> fetchData(
    request: Request,
): T {
    val data = fetch(request).json()

    // TODO use serialization instead
    return unsafeCast(data!!)
}
