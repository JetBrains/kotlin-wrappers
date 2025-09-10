package js.promise

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PromiseFulfilledResult<T : JsAny?> :
    PromiseSettledResult<T> {
    val value: T
}
