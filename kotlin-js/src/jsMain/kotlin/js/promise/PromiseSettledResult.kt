package js.promise

sealed external interface PromiseSettledResult<T>

fun <T> PromiseSettledResult<T>.toResult(): Result<T> =
    when (this) {
        is PromiseFulfilledResult,
        -> Result.success(value)

        is PromiseRejectedResult,
        -> Result.failure(reason)
    }
