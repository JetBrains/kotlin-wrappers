@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.promise

sealed external interface PromiseWithResolvers<T> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
