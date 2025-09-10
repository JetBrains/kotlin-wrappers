package js.iterable

import js.objects.JsPlainObject
import kotlin.contracts.contract
import kotlin.js.JsAny

@JsPlainObject
external interface IteratorResult<out T : JsAny?, out TReturn : JsAny?> {
    val done: Boolean
}

@Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
)
inline fun <T : JsAny?, TReturn : JsAny?> isYield(
    result: IteratorResult<T, TReturn>,
): Boolean {
    contract {
        returns(true) implies (result is IteratorYieldResult<T>)
        returns(false) implies (result is IteratorReturnResult<TReturn>)
    }

    return !result.done
}
