@file:Suppress(
    "EXTENSION_SHADOWED_BY_MEMBER",
)

package js.promise

@Deprecated("Use `await` method instead")
suspend inline fun <T> PromiseLike<T>.await(): T =
    awaitInternal(this)
