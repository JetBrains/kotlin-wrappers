package js.promise

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PromiseFulfilledResult<T : JsAny?> :
    PromiseSettledResult<T> {
    val value: T
}
