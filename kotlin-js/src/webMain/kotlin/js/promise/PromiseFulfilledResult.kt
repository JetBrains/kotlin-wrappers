package js.promise

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PromiseFulfilledResult<T : JsAny?> :
    PromiseSettledResult<T> {
    val value: T
}
