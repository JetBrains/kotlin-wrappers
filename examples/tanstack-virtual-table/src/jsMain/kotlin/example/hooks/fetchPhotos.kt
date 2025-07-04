package example.hooks

import example.entities.PhotoList
import js.reflect.unsafeCast
import web.http.Request
import web.http.fetch
import web.http.json

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
