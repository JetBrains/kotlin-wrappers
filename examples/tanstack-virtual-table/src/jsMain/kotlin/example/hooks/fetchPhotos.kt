package wrappers.example.hooks

import js.reflect.unsafeCast
import web.http.Request
import web.http.fetch
import wrappers.example.entities.PhotoList

private const val PHOTOS_URL = "https://jsonplaceholder.typicode.com/photos"

suspend fun fetchPhotos(): PhotoList =
    fetchData(Request(PHOTOS_URL))

private suspend fun <T> fetchData(
    request: Request,
): T {
    val data = fetch(request).json()

    // TODO use serialization instead
    return unsafeCast(data!!)
}
