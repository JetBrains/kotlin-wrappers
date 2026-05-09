package js.promise

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PromiseWithResolvers<T : JsAny?> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
