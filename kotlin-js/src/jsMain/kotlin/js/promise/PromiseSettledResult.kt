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
