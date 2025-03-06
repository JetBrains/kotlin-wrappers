package js.promise

import js.core.JsAny
import js.core.JsAnyMarker
import js.errors.toThrowable

sealed external interface PromiseSettledResult<T : JsAny?> :
    JsAnyMarker

fun <T : JsAny?> PromiseSettledResult<T>.toResult(): Result<T> =
    when (this) {
        is PromiseFulfilledResult,
            -> Result.success(value)

        is PromiseRejectedResult,
            -> Result.failure(reason.toThrowable())
    }
