package js.promise

import js.core.JsAny

sealed external interface PromiseWithResolvers<T : JsAny?> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
