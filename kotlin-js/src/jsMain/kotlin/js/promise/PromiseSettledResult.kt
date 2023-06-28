package js.promise

import js.errors.JsError

sealed external interface PromiseSettledResult<T> {
    val status: PromiseSettledResultStatus
}

private external interface PromiseFulfilledResult<T>
    : PromiseSettledResult<T> {
    // status: PromiseSettledResultStatus.fulfilled
    val value: T
}

private external interface PromiseRejectedResult {
    // status: PromiseSettledResultStatus.rejected
    val reason: JsError
}

fun <T> PromiseSettledResult<T>.toResult(): Result<T> =
    when (status) {
        PromiseSettledResultStatus.fulfilled,
        -> Result.success(unsafeCast<PromiseFulfilledResult<T>>().value)

        PromiseSettledResultStatus.rejected,
        -> Result.failure(unsafeCast<PromiseRejectedResult>().reason)

        else -> error("Unknown settled result `$status`")
    }
