package js.promise

import js.errors.JsError

sealed external interface PromiseRejectedResult {
    // status: PromiseSettledResultStatus.rejected
    val reason: JsError
}
