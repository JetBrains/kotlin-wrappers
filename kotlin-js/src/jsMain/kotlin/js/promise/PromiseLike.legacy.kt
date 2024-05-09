package js.promise

suspend inline fun <T> PromiseLike<T>.await(): T =
    awaitInternal(this)
