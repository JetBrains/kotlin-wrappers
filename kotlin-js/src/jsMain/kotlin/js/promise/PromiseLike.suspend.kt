package js.promise

import js.errors.toThrowable

suspend fun <T> PromiseLike<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it.toThrowable()) },
    ).await()
