package js.promise

import kotlin.js.JsAny

sealed external interface PromiseWithResolvers<T : JsAny?> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
