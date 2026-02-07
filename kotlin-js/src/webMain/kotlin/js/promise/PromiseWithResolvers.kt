package js.promise

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PromiseWithResolvers<T : JsAny?> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
