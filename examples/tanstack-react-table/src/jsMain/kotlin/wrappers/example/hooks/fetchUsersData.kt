package wrappers.example.hooks

import js.reflect.unsafeCast
import web.http.Request
import web.http.RequestInit
import web.http.fetch
import wrappers.example.entities.Key
import wrappers.example.entities.Users

private val USERS_URL = "https://jsonplaceholder.typicode.com/users"

suspend fun fetchUsersData(): Users =
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
    return unsafeCast(data)
}
