package js.promise

suspend fun <T> PromiseLike<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
