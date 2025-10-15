package js.promise

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PromiseWithResolvers<T : JsAny?> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
