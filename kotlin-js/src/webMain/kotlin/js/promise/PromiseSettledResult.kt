package js.promise

import js.errors.toThrowable
import js.objects.JsPlainObject
import kotlin.contracts.contract
import kotlin.js.JsAny

@JsPlainObject
external interface PromiseSettledResult<T : JsAny?> {
    val status: PromiseSettledStatus
}

@Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
)
inline fun <T : JsAny?> isFulfilled(
    result: PromiseSettledResult<T>,
): Boolean {
    contract {
        returns(true) implies (result is PromiseFulfilledResult<T>)
        returns(false) implies (result is PromiseRejectedResult)
    }

    return result.status == PromiseSettledStatus.fulfilled
}


fun <T : JsAny?> PromiseSettledResult<T>.toResult(): Result<T> =
    if (isFulfilled(this)) {
        Result.success(value)
    } else {
        Result.failure(reason.toThrowable())
    }
