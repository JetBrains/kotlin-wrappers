package js.promise

import js.errors.JsError

sealed external interface PromiseSettledResult<T> {
    val status: String
}

private external interface PromiseFulfilledResult<T>
    : PromiseSettledResult<T> {
    // status: "fulfilled"
    val value: T
}

private external interface PromiseRejectedResult {
    // status: "rejected";
    val reason: JsError
}
