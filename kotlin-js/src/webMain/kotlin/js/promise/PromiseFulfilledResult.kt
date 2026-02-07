package js.promise

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PromiseFulfilledResult<T : JsAny?> :
    PromiseSettledResult<T> {
    val value: T
}
