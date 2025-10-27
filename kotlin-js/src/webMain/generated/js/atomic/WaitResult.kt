package js.atomic

import js.objects.JsPlainObject
import kotlin.contracts.contract

@JsPlainObject
external interface WaitResult {
    val async: Boolean
}

@Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
)
inline fun isAsync(
    result: WaitResult,
): Boolean {
    contract {
        returns(true) implies (result is WaitAsyncResult)
        returns(false) implies (result is WaitSyncResult)
    }

    return result.async
}

