package js.promise

import js.core.JsAny
import js.errors.toThrowable

suspend fun <T : JsAny?> PromiseLike<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it.toThrowable()) },
    ).await()
