package js.promise

import js.errors.toThrowable

sealed external interface PromiseSettledResult<T>

fun <T> PromiseSettledResult<T>.toResult(): Result<T> =
    when (this) {
        is PromiseFulfilledResult,
        -> Result.success(value)

        is PromiseRejectedResult,
            -> Result.failure(reason.toThrowable())
    }
